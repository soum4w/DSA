#include <bits/stdc++.h> 
class CircularQueue{

    int* arr;
    int size;
    int front;
    int rear;
    public:
    CircularQueue(int n){
        size = n;
        arr = new int[n];
        front= rear = -1;
    }

    bool enqueue(int value){
        if((rear+1)%size==front){ //full
            return false;
        }

        if(front==-1){
            rear = front =0;
            arr[rear] = value;
            return true;
        }

        rear = (rear+1)%size;
        arr[rear] = value;

        return true;
    }
    
    int dequeue(){
        if(front==-1){
            return -1;
        }
        int ans = arr[front];
        if(front==rear){
            front= rear = -1;
            return ans;
        }
        front = (front+1)%size;
        return ans;
    }
};