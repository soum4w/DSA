package sortingAlgorithms;

public class MergeSort {
    static void merge(int[] arr, int start, int mid, int end) {
        // length of two sorted arrays
        int leftLen = mid - start + 1;
        int rightLen = end - mid;
        // create array
        int[] leftArr = new int[leftLen];
        int[] rightArr = new int[rightLen];
        // copy values
        for (int i = 0; i < leftLen; i++) {
            leftArr[i] = arr[start + i];
        }
        for (int i = 0; i < rightLen; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }
        // merge
        int i = 0, j = 0;
        int k = start;
        while (i < leftLen && j < rightLen) {
            if (leftArr[i] <= rightArr[j])
                arr[k++] = leftArr[i++];
            else
                arr[k++] = rightArr[j++];
        }
        // fill the remaining
        while (i < leftLen)
            arr[k++] = leftArr[i++];
        while (j < rightLen)
            arr[k++] = rightArr[j++];
    }

    static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) return;
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);

    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 1, 9, 2, 4, 6, 8 };
        mergeSort(arr, 0, arr.length - 1);
        for (int ele : arr)
            System.out.print(ele + " ");
    }
}
