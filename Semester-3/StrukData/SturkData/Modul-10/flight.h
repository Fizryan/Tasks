#ifndef FLIGHT_H_INCLUDED
#define FLIGHT_H_INCLUDED

#include <iostream>
#include <string>
#define info(P) (P->info)
#define next(P) (P->next)
#define first(L) (L.first)

using namespace std;

typedef struct jadwalPenerbangan{
    string Kode;
    string Jenis;
    string Tanggal;
    string Waktu;
    string Asal;
    string Tujuan;
    int Kapasitas;
};

typedef struct elementJadwal *adr_jadwalP;

typedef struct elementJadwal{
    jadwalPenerbangan info;
    adr_jadwalP next;
};

typedef struct ListJadwal{
    adr_jadwalP first;
};

void createListJadwal_103022300158(ListJadwal &L);
adr_jadwalP createElementJadwal_103022300158(jadwalPenerbangan X);
void insertLastJ_103022300158(ListJadwal &L, adr_jadwalP P);
void showJadwal_103022300158(ListJadwal L);
void deleteFirstJ_103022300158(ListJadwal &L, adr_jadwalP &P);
adr_jadwalP searchJ_103022300158(ListJadwal L, string dari, string ke, string tanggal);

#endif // FLIGHT_H_INCLUDED
