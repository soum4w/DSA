#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* next;

    Node(int data) {
        this->data = data;
        this->next = nullptr;
    }
};

class Queue {
private:
    Node* head; // front
    Node* tail; // rear
    int size;

public:
    Queue() {
        head = tail = nullptr;
        size = 0;
    }

    // Insert element at rear
    void enqueue(int value) {
        Node* newNode = new Node(value);

        if (tail == nullptr) { // queue empty
            head = tail = newNode;
        } else {
            tail->next = newNode;
            tail = newNode;
        }

        size++;
    }

    // Remove element from front
    void dequeue() {
        if (head == nullptr) {
            cout << "Queue Underflow (empty queue)" << endl;
            return;
        }

        Node* temp = head;
        head = head->next;

        // if queue becomes empty after removing
        if (head == nullptr) {
            tail = nullptr;
        }

        delete temp;
        size--;
    }

    // Get front element
    int front() {
        if (head == nullptr) {
            cout << "Queue is empty" << endl;
            return -1;
        }
        return head->data;
    }

    // Check if queue is empty
    bool isEmpty() {
        return head == nullptr;
    }

    // Get current size
    int getSize() {
        return size;
    }

    // Print all elements
    void print() {
        Node* temp = head;
        cout << "Queue: ";
        while (temp != nullptr) {
            cout << temp->data << " <- ";
            temp = temp->next;
        }
        cout << "NULL" << endl;
    }
};

int main() {
    Queue q;

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.print();

    cout << "Front element: " << q.front() << endl;

    q.dequeue();
    q.print();

    cout << "Queue size: " << q.getSize() << endl;

    q.dequeue();
    q.dequeue();
    q.dequeue(); // extra dequeue to test underflow

    cout << (q.isEmpty() ? "Queue is empty" : "Queue not empty") << endl;

    return 0;
}
