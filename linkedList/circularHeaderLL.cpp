#include <iostream>
using namespace std;

class Node{
    public:
    int data;
    Node* next;
    Node(int val=-1){
        data = val;
        next = nullptr;
    }
};

class CircularLL{
    public:
    Node* head;
    CircularLL(){
        head = new Node();
        head->next= head;
    }

    void insertData(int val){
        Node* newNode = new Node(val);

        Node* temp = head;

        while(temp->next!=head){
            temp = temp->next;
        }

        temp->next = newNode;
        newNode->next = head;
    }

    void display(){
        Node* temp = head->next;
        if(temp == head ) {
            cout<<"List is empty";
            return;
        }
        while (temp!=head) {
            cout<<temp->data<<" ";
            temp = temp->next;
        }
        cout<<endl;
    }
};
int main(){
    CircularLL cll;
    cll.insertData(43);
    cll.insertData(22);
    cll.insertData(12);
    cll.insertData(98);
    cll.display();
}
