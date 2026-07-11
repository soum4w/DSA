import java.util.*;

public class SortAStack {
    public void sortStack(Stack<Integer> st) {
        // Your code goes here
        if(st.isEmpty()) return;
        int top = st.pop();
        sortStack(st);
        insert(st,top);
    }

    private void insert(Stack<Integer> st, int val){
        if(st.isEmpty() || st.pop()<=val){
            st.push(val);
            return;
        }
        int top = st.pop();
        insert(st, val);
        st.push(top);
    }
}