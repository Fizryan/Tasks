#ifndef DLL_H_INCLUDED
#define DLL_H_INCLUDED
#include <iostream>

using namespace std;

typedef string infotype;
typedef struct elmList *address;

struct elmList {
    infotype info;
    address prev;
    address next;
};

struct List {
    address first;
    address last;
};

bool isEmpty(List L);
void createNewElmt(infotype X, address &P);
void insertFirst(List &L, address P);
void insertAfter(List &L, address Prec, address P);
void insertLast(List &L, address P);
void deleteFirst(List &L, address &P);
void deleteAfter(List &L, address Prec, address &P);
void deleteLast(List &L, address &P);
void concat(List L1, List L2, List &L3);
address findLagu(string Judul, List &L);
void removeLagu(string Judul, List &L);
void displayList(List L);
void displayMenu();

#endif
