package sortingAlgorithms;

public class BubbleSort {
    static void swap(int[] arr, int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean swapped = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]) {
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4};
        bubbleSort(arr);
        for(int ele: arr) System.out.print(ele+" ");
    }
}
