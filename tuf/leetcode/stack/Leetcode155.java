package leetcode.stack;

import java.util.Stack;

public class Leetcode155 {
    private Stack<Integer> minStack;
    private Stack<Integer> st;

    public MinStack() {
        minStack = new Stack<>();
        st = new Stack<>();
    }
    
    public void push(int value) {
        if(minStack.isEmpty() || minStack.peek()>=value){
            minStack.push(value);
        }
        st.push(value);
    }
    
    public void pop() {
        if(minStack.peek().equals(st.peek())) minStack.pop();
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
