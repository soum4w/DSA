#include <iostream>
using namespace std;


struct Node{
    int data;
    Node* next;

    Node(int val){
        data = val;
        next = nullptr;
    }
};

void insertAtEnd(Node*& head, int val){

    Node* newNode = new Node(val);

    if(head==nullptr){
        head = newNode;
        return;
    }

    Node* temp = head;

    while(temp->next!= nullptr){
        temp = temp->next;
    }

    temp->next = newNode;
}


void printList(Node* head){

    while(head!=nullptr){
        cout<<head->data<<" ";
        head = head->next;
    }

    cout<<endl;
}

Node* getMiddle(Node* head){
    Node* slow = head;
    Node* fast = head;

    while(fast!=nullptr && fast->next!=nullptr){
        slow= slow->next;
        fast = fast->next->next;
        
    }
    return slow; //this is the middle node 
}

int main(){

    Node* head = nullptr;
    insertAtEnd(head, 20);
    insertAtEnd(head, 30);
    insertAtEnd(head, 10);
    insertAtEnd(head, 90);
    insertAtEnd(head, 80);
    insertAtEnd(head, 40);

    printList(head);

    Node* mid = getMiddle(head);
    cout<<"Mid: "<<mid->data<<endl;


}