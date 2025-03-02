#ifndef QUEUE_VAKSINASI_H_INCLUDED
#define QUEUE_VAKSINASI_H_INCLUDED
#include <iostream>
#include <string>
using namespace std;

struct infotype{
    string nama;
    int usia;
    string pekerjaan;
    bool prioritas;
    int nomor_antrian;
    int waktu_daftar;
    bool kondisi_darurat;
};

struct ElemQ{
    infotype info;
    ElemQ* next;
};

struct Queue {
    ElemQ* head;
    ElemQ* tail;
};

void createQueue(Queue &Q);
bool isEmpty(Queue Q);
ElemQ* createElemQueue(string nama, int usia, string pekerjaan, int nomor_antrian);
void enqueue(Queue &Q, ElemQ *P);
void dequeue(Queue &Q, ElemQ *&P);
ElemQ* front(Queue Q);
ElemQ* back(Queue Q);
int size(Queue Q);

void printInfo(Queue Q);
void serveQueue(Queue &Q);
void reassignQueue(Queue &Q);
void checkWaitingTime(Queue &Q, int waktu_sekarang);
void emergencyHandle(Queue &Q, int nomor_antrian);
void updatePriority(Queue &Q);
ElemQ* findAndRemove(Queue &Q, int nomor_antrian);

#endif // QUEUE_VAKSINASI_H_INCLUDED
