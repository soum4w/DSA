#include <iostream>
using namespace std;

int divisionHash(int key, int tableSize) {
    return key % tableSize;
}

void readKeys(int keys[], int numKeys) {
    for (int i = 0; i < numKeys; i++) cin >> keys[i];
}

void initializeHashTable(int hashTable[], int tableSize) {
    for (int i = 0; i < tableSize; i++) hashTable[i] = -1; // -1 = empty
}

// Insert keys using linear probing
void insertKeys(int hashTable[], int tableSize, int keys[], int numKeys) {
    for (int i = 0; i < numKeys; i++) {
        int value = keys[i];
        int hashIndex = divisionHash(value, tableSize);
        int start = hashIndex;
        bool inserted = false;

        while (true) {
            if (hashTable[hashIndex] == -1) {        // empty slot
                hashTable[hashIndex] = value;
                inserted = true;
                break;
            }
            // optional: avoid inserting duplicates (uncomment to enable)
            // if (hashTable[hashIndex] == value) { inserted = true; break; }

            hashIndex = (hashIndex + 1) % tableSize; // linear probe
            if (hashIndex == start) break;            // table full (came back)
        }

        if (!inserted) {
            cout << "Table full — could not insert value " << value << '\n';
        }
    }
}

bool searchKey(int hashTable[], int tableSize, int key) {
    int h = divisionHash(key, tableSize);
    int start = h;
    while (true) {
        if (hashTable[h] == -1) return false;           // empty -> not found
        if (hashTable[h] == key) return true;           // found
        h = (h + 1) % tableSize;
        if (h == start) return false;                   // full loop -> not found
    }
}

void printTable(int hashTable[], int tableSize) {
    for (int i = 0; i < tableSize; ++i) {
        if (hashTable[i] == -1) cout << i << " : empty\n";
        else cout << i << " : " << hashTable[i] << '\n';
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

    // optional demo of search:
    // cout << (searchKey(hashTable, tableSize, keys[0]) ? "found\n" : "not found\n");

    return 0;
}
