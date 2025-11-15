#include<iostream>
using namespace std;

void heapify(int arr[], int size, int i){
    int largest = i;
    int leftIndex = 2*i;
    int rightIndex = 2*i +1;

    if(leftIndex<=size && arr[leftIndex]>arr[largest]){
        largest = leftIndex;
    }

    if(rightIndex<=size && arr[rightIndex]>arr[largest]){
        largest = rightIndex;
    }

    if(largest!=i){
        swap(arr[largest], arr[i]);
        heapify(arr, size, largest);
    }
}
int main(){

    int arr[6] = {-1, 34, 22, 76, 98, 11};
    int n = 5;

    for(int i = 1; i<=n; i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    for(int i=n/2; i>0;i--){
        heapify(arr, n, i);
    }

    for(int i = 1; i<=n; i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
