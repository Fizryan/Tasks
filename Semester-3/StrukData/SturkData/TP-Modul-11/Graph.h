#ifndef GRAPH_H_INCLUDED
#define GRAPH_H_INCLUDED

#include <iostream>

#define nextVertex(v) (v->nextVertex)
#define firstEdge(v) (v->firstEdge)
#define idVertex(v) (v->idVertex)
#define nextEdge(v) (v->nextEdge)
#define firstVertex(G) (G.firstVertex)

using namespace std;

typedef struct vertex* adrVertex;
typedef struct edge* adrEdge;

struct vertex{
    char idVertex;
    adrVertex nextVertex;
    adrEdge firstEdge;
};

struct edge{
    char destVertexID;
    int weight;
    adrEdge nextEdge;
};

struct graph{
    adrVertex firstVertex;
};

void createVertex_103022300158(char newVertexID, adrVertex &v);
void initGraph_103022300158(graph &G);
void addVertex_103022300158(graph &G, char newVertexID);
void buildGraph_103022300158(graph &G);

void printGraph_103022300158(graph &G);

#endif // GRAPH_H_INCLUDED
