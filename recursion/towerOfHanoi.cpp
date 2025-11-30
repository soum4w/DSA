#include <iostream>
using namespace std;

void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
    if (n == 0) return;

    // Move n-1 disks from source to auxiliary
    towerOfHanoi(n - 1, fromRod, auxRod, toRod);

    // Move the nth disk from source to destination
    cout << "Move disk " << n << " from " << fromRod << " to " << toRod << endl;

    // Move n-1 disks from auxiliary to destination
    towerOfHanoi(n - 1, auxRod, toRod, fromRod);
}

int main() {
    int n;
    cout << "Enter number of disks: ";
    cin >> n;

    towerOfHanoi(n, 'A', 'C', 'B'); 
    return 0;
}
