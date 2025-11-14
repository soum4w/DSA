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


Node* reverseList(Node* head){
    Node* prev = nullptr;
    Node* curr = head;
    Node* forwardd = nullptr;

    while(curr!=nullptr){
        forwardd = curr->next;
        curr->next = prev;
        prev = curr;
        curr = forwardd;

    }
    return prev;
}

Node* reverseListRecursion(Node*head){
    if(head==nullptr || head->next==nullptr) return head;

    Node* newHead = reverseListRecursion(head->next);

    head->next->next = head;
    head->next = nullptr;
    return newHead;
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

    // Node* newHead = reverseList(head);
    Node* newHead = reverseListRecursion(head);

    printList(newHead);


}