package sortingAlgorithms;

public class QuickSort {
    static void swap(int[] arr, int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp; 
    }

    static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int index = start-1;
        for(int i=start; i<end; i++){ // 3,1,5,7,8,2,4,6
            if(arr[i]<=pivot){
                index++;
                swap(arr, i, index);
            } 
        }
        swap(arr, index+1, end);
        return index+1;
    }

    static void quickSort(int[] arr, int start, int end){
        if(start>=end) return;
        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex-1);
        quickSort(arr, pivotIndex+1, end);
    }

    public static void main(String[] args) {
        int[] arr = {3,1,5,7,8,2,4,6};
        quickSort(arr, 0, arr.length-1);
        for(int ele:arr){
            System.out.print(ele+ " ");
        }
    }
}
