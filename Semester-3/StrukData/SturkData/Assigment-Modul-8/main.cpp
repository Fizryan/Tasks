#include "queue_vaksinasi.h"
#include <iostream>

using namespace std;

int main()
{
    Queue Q;
    createQueue(Q);
    ElemQ* P1 = createElemQueue("John Doe", 65, "lansia", 1);
    ElemQ* P2 = createElemQueue("Alice", 30, "tenaga kesehatan", 2);
    ElemQ* P3 = createElemQueue("Bob", 25, "pekerja", 3);
    ElemQ* P4 = createElemQueue("Charlie", 70, "pensiunan", 4);
    ElemQ* P5 = createElemQueue("David", 28, "pekerja", 5);
    enqueue(Q, P1);
    enqueue(Q, P2);
    enqueue(Q, P3);
    enqueue(Q, P4);
    enqueue(Q, P5);
    cout << "Isi antrian awal:" << endl;
    cout << "Daftar Antrian:" << endl;
    printInfo(Q);
    cout << "\nMelakukan pelayanan pada antrian:" << endl;
    serveQueue(Q);
    cout << "\nIsi antrian setelah pelayanan:" << endl;
    printInfo(Q);
    ElemQ* P6 = createElemQueue("Edward", 22, "pekerja", 6);
    enqueue(Q, P6);
    cout << "\nMengatur ulang antrian berdasarkan prioritas: " << endl;
    reassignQueue(Q);
    cout << "Daftar Antrian:" << endl;
    printInfo(Q);
    cout << "\nMemeriksa waktu tunggu dan mengubah prioritas jika lebih dari 2 jam: " << endl;
    checkWaitingTime(Q, 130);
    cout << "Daftar Antrian:" << endl;
    printInfo(Q);
    cout << "\nMenangani kondisi darurat untuk warga dengan nomor antrian 5: " << endl;
    emergencyHandle(Q, 5);
    cout << "Daftar Antrian:" << endl;
    printInfo(Q);
    cout << "\nMengupdate prioritas antrian setiap jam:" << endl;
    updatePriority(Q);
    cout << "Daftar Antrian:" << endl;
    printInfo(Q);
    cout << "\nMenghapus warga dengan nomor antrean 3:" << endl;
    ElemQ* removedElem = findAndRemove(Q, 3);
    if (removedElem) {
        cout << "Warga yang dihapus: " << removedElem->info.nama << endl;
    }
    cout << "Daftar Antrian:" << endl;
    printInfo(Q);
    cout << "\nUkuran antrean saat ini: " << size(Q) << endl;
    return 0;
}
