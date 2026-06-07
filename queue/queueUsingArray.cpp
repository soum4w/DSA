#include <iostream>
using namespace std;

class Queue {
    int frontIndex, rearIndex;
    int size;
    int *arr;

public:
    Queue(int s) {
        size = s;
        arr = new int[size];
        frontIndex = 0;
        rearIndex = -1;
    }

    bool isEmpty() {
        return frontIndex > rearIndex;
    }

    bool isFull() {
        return rearIndex == size - 1;
    }

    void enqueue(int x) {
        if (isFull()) {
            cout << "Queue is Full\n";
            return;
        }
        arr[++rearIndex] = x;
    }

    int dequeue() {
        if (isEmpty()) {
            cout << "Queue is Empty\n";
            return -1;
        }
        return arr[frontIndex++];
    }

    int front() {
        if (isEmpty()) return -1;
        return arr[frontIndex];
    }
};

int main() {
    Queue q(5);

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    cout << q.dequeue() << endl; // 10
    cout << q.front() << endl;   // 20
}
