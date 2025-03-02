#include "Graph.h"

void createVertex_103022300158(char newVertexID, adrVertex &v){
    v = new vertex;
    idVertex(v) = newVertexID;
    nextVertex(v) = nullptr;
    firstEdge(v) = nullptr;
}

void initGraph_103022300158(graph &G){
    firstVertex(G) = nullptr;
}

void addVertex_103022300158(graph &G, char newVertexID){
    adrVertex newVertex;
    createVertex_103022300158(newVertexID, newVertex);

    if (firstVertex(G) == nullptr){
        firstVertex(G) = newVertex;
    } else {
        adrVertex temp = firstVertex(G);
        while (nextVertex(temp) != nullptr){
            temp = nextVertex(temp);
        }
        nextVertex(temp) = newVertex;
    }
}

void buildGraph_103022300158(graph &G){
    char newVertexID;
    cout << "Masukan ID vertex: ";
    while (cin >> newVertexID){
        if (newVertexID < 'A' || newVertexID > 'Z'){
            break;
        }

        adrVertex temp = firstVertex(G);
        bool found = false;
        while (temp != nullptr){
            if (idVertex(temp) == newVertexID){
                found = true;
                break;
            }
            temp = nextVertex(temp);
        }

        if (!found){
            addVertex_103022300158(G, newVertexID);
        } else {
            cout << "Vertex ID sudah ada!" << endl;
        }

        cout << "Masukkan ID vertex berikutnya: ";
    }
}

void printGraph_103022300158(graph &G) {
    adrVertex v = firstVertex(G);
    if (firstVertex(G) == nullptr){
        cout << "\nGraph Kosong." << endl;
    } else {
        cout << "\nHasil Graph: " << endl;
    }
    while (v != nullptr){
        cout << "Vertex: " << idVertex(v) << endl;
        v = nextVertex(v);
    }
}
