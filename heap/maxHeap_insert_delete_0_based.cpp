#include <iostream>
using namespace std;

class maxHeap {
public:
    int arr[100];
    int size;

    maxHeap() {
        size = 0;
    }

    // insertion
    void insert(int val) {
        int index = size;
        arr[index] = val;
        size++;

        while (index > 0) {
            int parent = (index - 1) / 2;

            if (arr[parent] < arr[index]) {
                swap(arr[parent], arr[index]);
                index = parent;
            } else {
                return;
            }
        }
    }

    // deletion (remove max)
    void deleteFromHeap() {
        if (size == 0) {
            cout << "Nothing to delete." << endl;
            return;
        }

        arr[0] = arr[size - 1];
        size--;

        int i = 0;

        while (i < size) {
            int leftIndex = 2*i + 1;
            int rightIndex = 2*i + 2;
            int largest = i;

            if (leftIndex < size && arr[leftIndex] > arr[largest])
                largest = leftIndex;

            if (rightIndex < size && arr[rightIndex] > arr[largest])
                largest = rightIndex;

            if (largest != i) {
                swap(arr[i], arr[largest]);
                i = largest;
            } else {
                break;
            }
        }
    }

    void print() {
        for (int i = 0; i < size; i++) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
};

int main() {
    maxHeap h;

    h.insert(99);
    h.insert(78);
    h.insert(34);
    h.insert(27);
    h.insert(91);

    h.print();

    h.deleteFromHeap();

    h.print();

    return 0;
}
