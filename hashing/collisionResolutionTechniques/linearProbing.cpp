#include <iostream>
using namespace std;

int divisionHash(int key, int tableSize) {
    return key % tableSize;
}

void readKeys(int keys[], int numKeys) {
    for (int i = 0; i < numKeys; i++) cin >> keys[i];
}

void initializeHashTable(int hashTable[], int tableSize) {
    for (int i = 0; i < tableSize; i++) hashTable[i] = -1;
}

void insertKeys(int hashTable[], int tableSize, int keys[], int numKeys) {
    for (int i = 0; i < numKeys; i++) {
        int value = keys[i];
        int hashIndex = divisionHash(value, tableSize);
        int start = hashIndex;
        bool inserted = false;

        while (true) {
            if (hashTable[hashIndex] == -1) {
                hashTable[hashIndex] = value;
                inserted = true;
                break;
            }

            hashIndex = (hashIndex + 1) % tableSize; 
            if (hashIndex == start){
                cout << "Table full, could not insert value " << value <<endl;
                break;
            }            
        }
    }
}

void printTable(int hashTable[], int tableSize) {
    for (int i = 0; i < tableSize; ++i) {
        if (hashTable[i] == -1) cout << i << " : empty\n";
        else cout << i << " : " << hashTable[i] <<endl;
    }
}

int main() {
    const int tableSize = 10;
    int numKeys;
    cin >> numKeys;
    int keys[numKeys];
    readKeys(keys, numKeys);

    int hashTable[tableSize];
    initializeHashTable(hashTable, tableSize);

    insertKeys(hashTable, tableSize, keys, numKeys);
    printTable(hashTable, tableSize);
}
