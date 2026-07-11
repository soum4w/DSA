import java.util.Stack;

public class ReverseAStack {
    public void reverseStack(Stack<Integer> st) {
        // Your code goes here
        if(st.isEmpty()) return;
        int top = st.pop();
        reverseStack(st);
        insert(st,top);
    }

    private void insert(Stack<Integer> st, int val){
        if(st.isEmpty()) {
            st.push(val);
            return;
        }
        int top = st.pop();
        insert(st, val);
        st.push(top);
    }
}
