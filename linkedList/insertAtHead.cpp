#include <iostream>
using namespace std;

struct Node{
    int data;
    Node* next;
};

void insertAtTail(Node*& tail, int data){
    Node* newNode = new Node();
    newNode->data = data;
    tail->next = newNode;
    newNode->next = nullptr;
    tail = newNode;
}

void printNode(Node* head){
    Node* temp = head;
    while(temp!=nullptr){
        cout<<temp->data<<" ";
        temp = temp->next;
    }
}


int main(){
    Node* newNode = new Node();
    newNode->data = 10;
    newNode->next = nullptr;

    Node* head = newNode;
    Node* tail = newNode;

    
    insertAtTail(tail, 30);
    insertAtTail(tail, 50);
    printNode(head);
    cout<<endl;
}