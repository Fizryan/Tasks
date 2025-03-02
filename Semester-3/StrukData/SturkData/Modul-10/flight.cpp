#include "flight.h"

void createListJadwal_103022300158(ListJadwal &L){
    first(L) = nullptr;
}

adr_jadwalP createElementJadwal_103022300158(jadwalPenerbangan X){
    adr_jadwalP P = new elementJadwal;
    info(P) = X;
    next(P) = nullptr;
    return P;
}

void insertLastJ_103022300158(ListJadwal &L, adr_jadwalP P){
    if (first(L) == nullptr){
        first(L) = P;
    } else {
        adr_jadwalP temp = first(L);
        while (next(temp) != nullptr){
            temp = next(temp);
        }
        next(temp) = P;
    }
}

void showJadwal_103022300158(ListJadwal L){
    adr_jadwalP P = first(L);
    while (P != nullptr){
        cout << "Kode: " << info(P).Kode;
        cout << ", Jenis: " << info(P).Jenis;
        cout << ", Tanggal: " << info(P).Tanggal;
        cout << ", Waktu: " << info(P).Waktu;
        cout << ", Asal: " << info(P).Asal;
        cout << ", Tujuan: " << info(P).Tujuan;
        cout << ", Kapasitas: " << info(P).Kapasitas;
        cout << endl;
        P = next(P);
    }
}

void deleteFirstJ_103022300158(ListJadwal &L, adr_jadwalP &P){
    if (first(L) != nullptr){
        P = first(L);
        first(L) = next(P);
        next(P) = nullptr;
    } else {
        P = nullptr;
    }
}

adr_jadwalP searchJ_103022300158(ListJadwal L, string dari, string ke, string tanggal){
    adr_jadwalP P = first(L);
    while (P != nullptr){
        if (info(P).Asal == dari && info(P).Tujuan == ke && info(P).Tanggal == tanggal){
            return P;
        }
        P = next(P);
    }
    return nullptr;
}
