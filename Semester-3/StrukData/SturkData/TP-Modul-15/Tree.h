#ifndef TREE_H_INCLUDED
#define TREE_H_INCLUDED
#include <iostream>

using namespace std;

typedef int infotype;

struct Node{
    infotype info;
    Node *left;
    Node *right;
};

typedef Node* adrNode;

adrNode newNode_103022300158(infotype x);
void insertNode_103022300158(adrNode &root, adrNode p);
void deleteNode_103022300158(adrNode &root, adrNode &p);
void printInOrder_103022300158(adrNode root);
adrNode findMin_103022300158(adrNode root);

#endif // TREE_H_INCLUDED
