package sortingAlgorithms;

public class InsertionSort {
    static void swap(int[] arr, int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4};
        insertionSort(arr);
        for(int ele:arr) System.out.print(ele+" ");
    }
}
