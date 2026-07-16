package stack;


public class LinkedListStack {
    private static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    private Node top;

    public LinkedListStack() {
        top = null;
    }

    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if(isEmpty()) throw new RuntimeException("Stack is empty");
        int value = top.data;
        top = top.next;
        return value;
    }

    public int top() {
        if(isEmpty()) throw new RuntimeException("Stack is empty");
        return top.data;
    }

    public boolean isEmpty() {
        return top==null;
    }
}
