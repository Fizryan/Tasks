#include <iostream>
#include "Tree.h"

using namespace std;

int main()
{
    adrNode root = nullptr;

    int values[] = {8, 9, 12, 13, 15, 17, 7, 6, 4};
    for (int value : values) {
        adrNode p = newNode_103022300158(value);
        insertNode_103022300158(root, p);
    }
    printInOrder_103022300158(root);
    cout << endl;

    for (int value : values) {
        adrNode temp = newNode_103022300158(value);
        deleteNode_103022300158(root, temp);
        printInOrder_103022300158(root);
        if (root == nullptr) {
            cout << "(Kosong)";
        }
        cout << endl;
    }

    return 0;
}
