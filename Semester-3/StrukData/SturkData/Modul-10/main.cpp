#include "flight.h"
#include <iostream>

using namespace std;

int main()
{
    ListJadwal L;
    int n;
    createListJadwal_103022300158(L);

    cout << "Masukkan jumlah jadwal penerbangan: ";
    cin >> n;

    for (int i = 0; i < n; i++) {
        jadwalPenerbangan data;
        if (i > 0){
            cout << endl;
        }
        cout << "Masukkan data penerbangan ke-" << i + 1 << endl;
        cout << "Kode: "; cin >> data.Kode;
        cout << "Jenis: "; cin >> data.Jenis;
        cout << "Tanggal: "; cin >> data.Tanggal;
        cout << "Waktu: "; cin >> data.Waktu;
        cout << "Asal: "; cin >> data.Asal;
        cout << "Tujuan: "; cin >> data.Tujuan;
        cout << "Kapasitas: "; cin >> data.Kapasitas;

        adr_jadwalP P = createElementJadwal_103022300158(data);
        insertLastJ_103022300158(L, P);
    }

    cout << "\nData jadwal penerbangan:" << endl;
    showJadwal_103022300158(L);

    adr_jadwalP deleted;
    deleteFirstJ_103022300158(L, deleted);
    cout << "\nMenghapus jadwal pertama:" << endl;
    showJadwal_103022300158(L);

    string asal, tujuan, tanggal;
    cout << "\nMasukkan asal, tujuan, dan tanggal untuk pencarian:" << endl;
    cin >> asal >> tujuan >> tanggal;

    adr_jadwalP searchResult = searchJ_103022300158(L, asal, tujuan, tanggal);
    if (searchResult) {
        cout << endl;
        cout << "Jadwal ditemukan tujuan: " << info(searchResult).Asal << " - " << info(searchResult).Tujuan << endl;
        cout << "Kode: " << info(searchResult).Kode << endl;
        cout << "Jenis: " << info(searchResult).Jenis << endl;
        cout << "Tanggal: " << info(searchResult).Tanggal << endl;
        cout << "Waktu: " << info(searchResult).Waktu << endl;
        cout << endl;
    } else {
        cout << "\nJadwal tujuan tidak ditemukan." << endl;
    }

    return 0;
}
