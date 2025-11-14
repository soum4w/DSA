#include <iostream>
using namespace std;

int partition(int* arr, int start, int end){
    int pivotElement = arr[end];
    int pivotIndex = start-1;
    for(int i=start; i<end; i++){
        if(arr[i]<=pivotElement){
            pivotIndex++;
            swap(arr[i], arr[pivotIndex]);
        }
    }

    swap(arr[end], arr[pivotIndex+1]);
    return pivotIndex+1;
}

void quickSort(int arr[], int start, int end){
    if(start>=end) return;

    int pivotIndex = partition(arr, start, end);
    quickSort(arr,start,pivotIndex-1);
    quickSort(arr, pivotIndex+1, end);
}

int main(){
    int size; cin>>size;
    int* arr = new int[size];
    for(int i=0; i<size; i++){
        cin>>arr[i];
    }

    quickSort(arr, 0, size-1);

    for(int i=0; i<size; i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}