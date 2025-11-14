#include <iostream>
using namespace std;

void merge(int *arr, int start,int mid,int end){
    int leftLen = mid-start+1;
    int rightLen = end-mid;

    int* leftArr = new int[leftLen];
    int* rightArr = new int[rightLen];

    for(int i=0;i<leftLen; i++){
        leftArr[i] = arr[start+i];
    }

    for(int i=0; i<rightLen; i++){
        rightArr[i] = arr[mid+1+i];
    }

    int i=0, j=0, k= start;

    while(i<leftLen && j <rightLen){
        if(leftArr[i]<= rightArr[j]){
            arr[k++] = leftArr[i++];
        } else {
            arr[k++] = rightArr[j++];
        }
    }

    while(i<leftLen) arr[k++] = leftArr[i++];
    while(j<rightLen) arr[k++] = rightArr[j++];
}

void mergeSort(int* arr, int start, int end){
    if(start>=end) return;
    int mid = start+(end-start)/2;
    mergeSort(arr,start,mid);
    mergeSort(arr, mid+1, end);
    merge(arr, start, mid, end);
}
int main(){
    int size;
    cin>>size;
    int *arr = new int[size];
    for(int i=0; i<size; i++){
        cin>>arr[i];
    }

    mergeSort(arr, 0, size-1);

    for(int i=0; i<size; i++){
        cout<<arr[i]<<" ";
    }
}