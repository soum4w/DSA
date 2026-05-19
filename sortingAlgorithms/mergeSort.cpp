#include <bits/stdc++.h>
using namespace std;

void merge(vector<int>&arr, int start, int end, int mid){
    //find size of two portions
    int leftSize = mid-start+1;
    int rightSize = end-mid;

    //copy elements 
    vector<int> leftArr (leftSize);
    vector<int> rightArr (rightSize);

    for(int i=0; i<leftSize; i++){
        leftArr[i] = arr[start + i];
    }

    for(int i=0; i<rightSize; i++){
        rightArr[i] = arr[i+mid+1] ;
    }

    //merge two sorted array
    int i =0, j=0, k = start;

    while(i<leftSize && j<rightSize){
        if(leftArr[i]<rightArr[j]) arr[k++] =  leftArr[i++];
        else arr[k++] = rightArr[j++];
    }

    //push remaining elements 
    while(i<leftSize) arr[k++] = leftArr[i++];
    while(j<rightSize) arr[k++] = rightArr[j++];
}

void mergeSort(vector<int>& arr, int start, int end){
    if(start>=end) return;
    int mid = start+(end-start)/2;
    mergeSort(arr, start, mid);
    mergeSort(arr, mid+1, end);
    merge(arr, start, end, mid );
    
}

void printArr(const vector<int>& arr){
    for(int ele: arr){
        cout<<ele<<" ";
    }
}

int main(){
    vector<int> arr = {54,11,87,34};
    mergeSort(arr,0,arr.size()-1);
    printArr(arr);
}