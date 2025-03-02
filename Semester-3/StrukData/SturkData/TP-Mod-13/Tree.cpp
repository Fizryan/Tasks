#include "Tree.h"
#include <iostream>

using namespace std;

adrNode newNode_103022300158(infotype x){
    adrNode p = new Node;
    p->info = x;
    p->left = nullptr;
    p->right = nullptr;
    return p;
}

adrNode findNode_103022300158(adrNode root, infotype x){
    if (root == nullptr || root->info == x) return root;
    if (x < root->info) return findNode_103022300158(root->left, x);
    return findNode_103022300158(root->right, x);
}

void insertNode_103022300158(adrNode &root, adrNode p){
    if (root == nullptr){
        root = p;
    } else if (p->info < root->info){
        insertNode_103022300158(root->left, p);
    } else {
        insertNode_103022300158(root->right, p);
    }
}

void printPreOrder_103022300158(adrNode root){
    if (root != nullptr){
        cout << root->info << " ";
        printPreOrder_103022300158(root->left);
        printPreOrder_103022300158(root->right);
    }
}

void printDescendant_103022300158(adrNode root, infotype x){
    adrNode node = findNode_103022300158(root, x);
    if (node != nullptr){
        printPreOrder_103022300158(node->left);
        printPreOrder_103022300158(node->right);
    }
}

int sumNode_103022300158(adrNode root){
    if (root == nullptr) return 0;
    return root->info + sumNode_103022300158(root->left) + sumNode_103022300158(root->right);
}

int countLeaves_103022300158(adrNode root){
    if (root == nullptr) return 0;
    if (root->left == nullptr && root->right == nullptr) return 1;
    return countLeaves_103022300158(root->left) + countLeaves_103022300158(root->right);
}

int heightTree_103022300158(adrNode root){
    if (root == nullptr) return -1;
    int heightLeft = heightTree_103022300158(root->left);
    int heightRight = heightTree_103022300158(root->right);
    return 1 + max(heightLeft, heightRight);
}
