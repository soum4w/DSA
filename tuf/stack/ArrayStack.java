package stack;

public class ArrayStack {
    private int[] stack;
    private int capacity;
    private int top;

    public ArrayStack() {
        capacity = 101;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int x) {
        if(top==capacity-1){
            throw new RuntimeException("Stack Overflow");
        }
        stack[++top] = x;
    }

    public int pop() {
        if(isEmpty()) throw new RuntimeException("Stack is empty");
        return stack[top--];
    }

    public int top() {
        if(isEmpty()) throw new RuntimeException("Stack is Empty");
        return stack[top];
    }

    public boolean isEmpty() {
        return top==-1;
    }
}

