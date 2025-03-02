#include "queue_vaksinasi.h"
#include <iostream>
using namespace std;

void createQueue(Queue &Q){
    Q.head = nullptr;
    Q.tail = nullptr;
}

bool isEmpty(Queue Q){
    return Q.head == nullptr;
}

ElemQ* createElemQueue(string nama, int usia, string pekerjaan, int nomor_antrian){
    ElemQ* P = new ElemQ;
    P->info.nama = nama;
    P->info.usia = usia;
    P->info.pekerjaan = pekerjaan;
    P->info.prioritas = (usia >= 60 || pekerjaan == "tenaga kesehatan");
    P->info.nomor_antrian = nomor_antrian;
    P->info.kondisi_darurat = false;
    P->next = nullptr;
    return P;
}

void enqueue(Queue &Q, ElemQ *P){
    if (isEmpty(Q)){
        Q.head = P;
        Q.tail = P;
    } else if (P->info.prioritas) {
        if (!Q.head->info.prioritas){
            P->next = Q.head;
            Q.head = P;
        } else {
            ElemQ *temp = Q.head;
            while (temp->next != nullptr && temp->next->info.prioritas){
                temp = temp->next;
            }
            P->next = temp->next;
            temp->next = P;
            if (P->next == nullptr){
                Q.tail = P;
            }
        }
    } else {
        Q.tail->next = P;
        Q.tail = P;
    }
}

void dequeue(Queue &Q, ElemQ *&P){
    if (isEmpty(Q)){
        P = nullptr;
        cout << "Semua warga telah terlayani" << endl;
    } else {
        P = Q.head;
        Q.head = Q.head->next;
        if (Q.head == nullptr){
            Q.tail = nullptr;
        }
        P->next = nullptr;
    }
}

ElemQ* front(Queue Q){
    return Q.head;
}

ElemQ* back(Queue Q){
    return Q.tail;
}

int size(Queue Q){
    int count = 0;
    ElemQ* temp = Q.head;
    while(temp != nullptr){
        count++;
        temp = temp->next;
    }
    return count;
}

void printInfo(Queue Q){
    if (isEmpty(Q)){
        cout << "Antrian Kosong." << endl;
        return;
    }
    ElemQ* temp = Q.head;
    while (temp != nullptr){
        cout << "Nama\t\t: " << temp->info.nama << endl;
        cout << "Usia\t\t: " << temp->info.usia << endl;
        cout << "Pekerjaan\t: " << temp->info.pekerjaan << endl;
        cout << "Prioritas\t: " << (temp->info.prioritas ? "Ya" : "Tidak") << endl;
        cout << "Nomor Antrian\t: " << temp->info.nomor_antrian << endl;
        cout << "----------------------------------------" << endl;
        temp = temp->next;
    }
}

void serveQueue(Queue &Q){
    int counter = 0;
    ElemQ* temp;
    while (counter < 100 && !isEmpty(Q)){
        dequeue(Q, temp);
        cout << "Melayani Warga:" << endl;
        cout << "Nama\t\t: " << temp->info.nama << endl;
        cout << "Usia\t\t: " << temp->info.usia << endl;
        cout << "Pekerjaan\t: " << temp->info.pekerjaan << endl;
        cout << "Prioritas\t: " << (temp->info.prioritas ? "Ya" : "Tidak") << endl;
        cout << "Vaksinasi berhasil." << endl;
        cout << "----------------------------------------" << endl;
        delete temp;
        counter++;
    }
    if (counter == 100) {
        cout << "Kapasitas Penuh." << endl;
    }
    if (!isEmpty(Q)) {
        cout << "Warga yang belum terlayani diminta kembali besok." << endl;
    }
}

void reassignQueue(Queue &Q){
    Queue tempQueue;
    createQueue(tempQueue);
    ElemQ* current = Q.head;

    while (current != nullptr){
        ElemQ* next = current->next;
        current->next = nullptr;
        if (current->info.prioritas){
            current->next = tempQueue.head;
            tempQueue.head = current;
            if (tempQueue.tail == nullptr){
                tempQueue.tail = current;
            }
        } else {
            if (tempQueue.tail == nullptr) {
                tempQueue.head = current;
                tempQueue.tail = current;
            } else {
                tempQueue.tail->next = current;
                tempQueue.tail = current;
            }
        }
        current = next;
    }
    Q = tempQueue;
}

void checkWaitingTime(Queue &Q, int waktu_sekarang){
    ElemQ* current = Q.head;
    while (current != nullptr){
        int waiting_time = waktu_sekarang - current->info.waktu_daftar;
        if (waiting_time > 120 && !current->info.prioritas){
            current->info.prioritas = true;
        }
        current = current->next;
    }
    reassignQueue(Q);
}

void emergencyHandle(Queue &Q, int nomor_antrian){
    ElemQ* target = findAndRemove(Q, nomor_antrian);
    if (target != nullptr) {
        target->info.kondisi_darurat = true;
        target->next = Q.head;
        Q.head = target;
        if (Q.tail == nullptr){
            Q.tail = target;
        }
    }
}

void updatePriority(Queue &Q){
    Queue tempQueue;
    createQueue(tempQueue);
    ElemQ* current = Q.head;

    while (current != nullptr){
        ElemQ* next = current->next;
        current->next = nullptr;
        if (current->info.kondisi_darurat){
            current->next = tempQueue.head;
            tempQueue.head = current;
            if (tempQueue.tail == nullptr){
                tempQueue.tail = current;
            }
        } else if (current->info.prioritas){
            current->next = tempQueue.head;
            tempQueue.head = current;
        } else {
            if (tempQueue.tail == nullptr){
                tempQueue.head = tempQueue.tail;
                tempQueue.tail = current;
            } else {
                tempQueue.tail->next = current;
                tempQueue.tail = current;
            }
        }
        current = next;
    }
    Q = tempQueue;
}

ElemQ* findAndRemove(Queue &Q, int nomor_antrian){
    ElemQ* current = Q.head;
    ElemQ* prev = nullptr;
    while (current != nullptr){
        if (current->info.nomor_antrian == nomor_antrian){
            if(prev == nullptr){
                Q.head = current->next;
            } else {
                prev->next = current->next;
            }
            if (current == Q.tail){
                Q.tail = prev;
            }
            ElemQ* temp = current;
            current = current->next;
            return temp;
        }
        prev = current;
        current = current->next;
    }
    cout << "Warga dengan nomor antrian " << nomor_antrian << " tidak ditemukan." << endl;
    return nullptr;
}
