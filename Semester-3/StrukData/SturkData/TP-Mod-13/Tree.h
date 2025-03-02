#ifndef TREE_H_INCLUDED
#define TREE_H_INCLUDED
#include <iostream>

using namespace std;

typedef int infotype;
typedef struct Node *adrNode;

struct Node {
    infotype info;
    adrNode left, right;
};

adrNode newNode_103022300158(infotype x);
adrNode findNode_103022300158(adrNode root, infotype x);
void insertNode_103022300158(adrNode &root, adrNode p);
void printPreOrder_103022300158(adrNode root);
void printDescendant_103022300158(adrNode root, infotype x);
int sumNode_103022300158(adrNode root);
int countLeaves_103022300158(adrNode root);
int heightTree_103022300158(adrNode root);

#endif // TREE_H_INCLUDED
