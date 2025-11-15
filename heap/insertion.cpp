//heap insertion
#include <iostream>
using namespace std;

class maxHeap{
    public:
    int arr[100];
    int size;

    maxHeap(){
        size = 0;
        arr[0] = -1;
    }

    void insert(int val){
        size++;
        int index = size;
        arr[index] = val;

        while(index>1){
            int parent = index/2;

            if(arr[parent]<arr[index]){
                swap(arr[parent], arr[index]);
                index = parent;
            } else return;
        }
    }

    void print(){
        for(int i=1; i<=size; i++){
            cout<<arr[i]<<" ";
        }
        cout<<endl;
    }
};

int main(){
    maxHeap h;

    h.insert(99);
    h.insert(78);
    h.insert(34);

    h.print();
    return 0;
}
