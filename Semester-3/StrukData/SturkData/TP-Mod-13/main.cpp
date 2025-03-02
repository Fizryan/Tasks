#include <iostream>
#include "Tree.h"

using namespace std;

int main()
{
    int x[9] = {5, 3, 9, 10, 4, 7, 1, 8, 6};
    adrNode root = nullptr;

    cout << "===================================================" << endl;
    for (int i = 0; i < 9; i++){
        cout << x[i] << " ";
    }

    for (int i = 0; i < 9; i++){
        adrNode p = newNode_103022300158(x[i]);
        insertNode_103022300158(root, p);
    }
    printf("\n");
    printf("\nPre Order\t\t: ");

    printPreOrder_103022300158(root);

    printf("\n");
    printf("\nDescendent of Node 9\t: ");
    printDescendant_103022300158(root, 9);

    printf("\n");
    printf("\nSum of BST info\t\t: ");
    cout << sumNode_103022300158(root);

    printf("\n");
    printf("\nNumber of Leaves\t: ");
    cout << countLeaves_103022300158(root);

    printf("\n");
    printf("\nHeight of Tree\t\t: ");
    cout << heightTree_103022300158(root);

    cout << endl;
    cout << "===================================================" << endl;

    return 0;
}
