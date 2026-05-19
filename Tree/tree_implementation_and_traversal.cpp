//  Binary Tree Implementation

/*
           - Info -
pre order =  root , left , right
in order = left , root , right
post order = left , right , root

*/

#include <bits/stdc++.h>
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
static int idx = -1;
Node* buildTree(const vector<int>& preOrder){

/* we have used const and & because we don't want to change the preOrde list and without this it will create copy everytime the recursion runs*/

    idx++;
    if(preOrder[idx]== -1) return NULL;

    Node* root = new Node(preOrder[idx]);
    root->left = buildTree(preOrder);
    root->right = buildTree(preOrder);
    return root;
}

// traversal
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
/*      1
       / \
      2   3
         / \
        4   5           
*/
    Node* root = buildTree(preOrderList);

    preOrder(root); cout<<endl;
    inOrder(root); cout<<endl;
    postOrder(root); cout<<endl;


}
