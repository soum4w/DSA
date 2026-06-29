package sortingAlgorithms;
public class SelectionSort {
    static void swap(int[] arr, int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j = i+1; j<n; j++){
                if(arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            if(i!=minIndex) {
                //swap 
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        //find smallest and put in the first 
        int[] arr = {2,5,1,4,3};
        selectionSort(arr);
        for(int ele: arr)
            System.out.print(ele + " ");
    }
}
