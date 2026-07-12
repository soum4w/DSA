package queue;

public class ArrayQueue {
    private int[] queue;
    private int capacity;
    private int front;
    private int rear;

    public ArrayQueue() {
        capacity = 101;
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }

    public void push(int x) {
        if(rear==capacity-1) throw new RuntimeException("Queue is full");
        queue[++rear] = x;
    }

    public int pop() {
        if(isEmpty()) throw new RuntimeException("Queue is empty");
        return queue[front++];
    }

    public int peek() {
        if(isEmpty()) throw new RuntimeException("Queue is empty");
        return queue[front];
    }

    public boolean isEmpty() {
        return rear<front;
    }
}