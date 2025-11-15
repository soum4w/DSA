#include<iostream>
#include <vector>
using namespace std;

void heapify(vector<int>& arr, int n, int i){
    int leftIndex = 2*i+1;
    int rightIndex = 2*i+2;
    int largest = i;

    if(leftIndex<n && arr[leftIndex]>arr[largest]) largest = leftIndex;
    if(rightIndex<n && arr[rightIndex]> arr[largest]) largest = rightIndex;

    if(largest!= i) {
        swap(arr[largest], arr[i]);
        heapify(arr, n, largest);
    }
}

void heapSort(vector<int>& arr){
    int n = arr.size();

    //build max heap from the array
    for(int i= n/2-1; i>=0; i--){
        heapify(arr, n, i);
    }

    //sort the array
    for(int i=n-1; i>0; i--){
        swap(arr[i], arr[0]); //swapping the largest element with the last element, after heapify (max heap) the first element will be the largest
        heapify(arr, i, 0); //passing 0 because after swapping (with root) we need to heapify again to maintain the heap
    }
}

int main(){
    vector<int> arr = {9,5,2,7,1};

    heapSort(arr);

    for(int val: arr){
        cout<<val<<" ";
    }
    cout<<endl;
}
