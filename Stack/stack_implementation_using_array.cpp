#include <iostream>
using namespace std;

class Stack{
  
    int* arr;
    int size;
    int top;

    
    public:
    
    Stack(int size){
        this->size = size;
        top = -1;
        arr = new int[size];
    }

    void push(int element){
        if(top == size-1){
            cout<<"Stack overflow"<<endl;
            return;
        } 

        top ++;
        arr[top] = element;
    }

    void pop(){
        if(top == -1){
            cout<<"Stack underflow"<<endl;
            return;
        }

        top--;
    }

    //alternative 
    /*
    bool push(int element) {
        if (isFull()) {
            cout << "Stack overflow" << endl;
            return false;
        }
        arr[++top] = element;
        return true;
    }

    bool pop() {
        if (isEmpty()) {
            cout << "Stack underflow" << endl;
            return false;
        }
        top--;
        return true;
    }
    */

    int peek(){
        if(top==-1){
            cout<<"Stack is empty"<<endl;
            return -1;
        }
        return arr[top];
    }

    bool isEmpty(){
        return top ==-1;
    }

    bool isfull(){
        return top == size-1;
    }

    ~Stack(){
        delete[] arr;
    }
};

int main(){

    Stack st(5);

    if(st.isEmpty()){
        cout<<"stack empty"<<endl;
    };
    st.push(42);
    st.push(33);
    cout<<st.isfull()<<endl;
    cout<<st.peek()<<endl;
    st.push(11);
    st.push(22);
    st.push(322);
    // // st.push(22);
    st.pop();
    cout<<st.peek()<<endl;
    return 0;
}