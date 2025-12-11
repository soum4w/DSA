#include <bits/stdc++.h>
using namespace std;

void bfs(vector<int> adj[], int start, int n){
    queue<int> q;
    vector<bool> visited(n, false);
    q.push(start);
    visited[start] = true;
    while(!q.empty()){
        int node = q.front();
        q.pop();
        cout<<node<<" ";
        //visit neighbours
        for(int val: adj[node]){
            if(!visited[val]){
                q.push(val);
                visited[val] = true;
            }
        }
    }
    cout<<endl;
}

int main(){
    int n=5;
    vector<int> adj[n];
    adj[0]= {1};
    adj[1]={0,2,3};
    adj[2]={1,4};
    adj[3]={1,4};
    adj[4]={2,3};
    
    bfs(adj, 0, 5);
}