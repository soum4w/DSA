//implementation with adjacency list 


#include <bits/stdc++.h>
#include <unordered_map>
using namespace std;

class Graph {
    public:
    unordered_map <int, list<int>> adj;
    
    void addEdge(int u, int v, bool direction){
        //0 for undirected graph and 1 for directed 
        adj[u].push_back(v);
        if(direction == 0) adj[v].push_back(u);  
    }
  
    void printList(){
        for(auto it: adj){
            cout<<it.first<<"->";
            for(auto iter: it.second){
                cout<<iter<<",";
            }
            cout<<endl;
        }
    }
    
};
int main(){
    Graph g;
    int numOfEdges; cin>>numOfEdges;
    for(int i=0; i<numOfEdges; i++){
        int u, v;
        cin>>u>>v;
        g.addEdge(u, v, 0);
    }
    g.printList();
}
