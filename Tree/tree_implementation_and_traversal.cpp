//       binary tree implementation

/*
           - info -
pre order =  root , left , right
in order = left , root , right
post order = left , right , root

*/

#include <iostream>
#include<vector>
using namespace std;

class Node{
    public:
    int data;
    Node* right;
    Node* left;

    Node(int val){
        data = val;
        left = right = NULL;
    }
};
static int index = -1;
Node* buildTree(const vector<int>& preOrder){

/* we have used const and & because without & >>
Each recursive call makes a new copy of the vector.
For your recursion (which can call itself many times), that’s massive overhead in both time and memory.
So your recursion would run slow and waste memory.*/

    index++;
    if(preOrder[index]== -1) return NULL;

    Node* root = new Node(preOrder[index]);
    root->left = buildTree(preOrder);
    root->right = buildTree(preOrder);
    return root;
}


void preOrder(Node* root){
    if(root==NULL) return;

    cout<<root->data<<" ";
    preOrder(root->left);
    preOrder(root->right);
}


void inOrder(Node* root){
    if(root==NULL) return;

    inOrder(root->left);
    cout<<root->data<<" ";
    inOrder(root->right);
}

void postOrder(Node* root){
    if(root==NULL) return;

    postOrder(root->left);
    postOrder(root->right);
    cout<<root->data<<" ";
}
int main(){

    vector<int> preOrderList = {1,2,-1,-1,3,4,-1,-1,5,-1,-1};
    Node* root = buildTree(preOrderList);

    preOrder(root); cout<<endl;
    inOrder(root); cout<<endl;
    postOrder(root); cout<<endl;


}
