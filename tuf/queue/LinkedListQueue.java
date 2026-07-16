package queue;

public class LinkedListQueue {
    private static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public LinkedListQueue() {
        head = null;
        tail = null;
    }

    public void push(int x) {
        Node newNode = new Node(x);
        if(head==null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public int pop() {
        if(isEmpty()) throw new RuntimeException("Queue is empty");
        int value = head.data;
        head = head.next;
        if(head==null) tail = null;
        return value;
    }

    public int peek() {
        if(isEmpty()) throw new RuntimeException("Queue is empty");
        return head.data;
    }

    public boolean isEmpty() {
        return head==null;
    }
}
