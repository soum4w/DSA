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
    //insertion
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

    //deletion
    void deleteFromHeap() {
        if(size == 0) {
            cout << "Nothing to delete.";
            return;
        }

        arr[1] = arr[size];
        size--;

        int i = 1;

        while(i <= size) {
            int leftIndex = 2*i;
            int rightIndex = 2*i + 1;
            int largest = i;

            if(leftIndex <= size && arr[leftIndex] > arr[largest])
                largest = leftIndex;

            if(rightIndex <= size && arr[rightIndex] > arr[largest])
                largest = rightIndex;

            if(largest != i) {
                swap(arr[i], arr[largest]);
                i = largest;
            } else break;
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
    h.insert(27);
    h.insert(91);

    h.print();

    h.deleteFromHeap();

    h.print();
    return 0;
}
