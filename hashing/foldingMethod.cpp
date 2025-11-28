#include<iostream>
using namespace std;

int foldinghash(int key)
{
    int sum = 0;

    while (key > 0)
    {
        sum += key % 100;   // take last TWO digits
        key /= 100;         // remove last TWO digits
    }

    return sum;
}

int main()
{
    int key = 12345;
    cout << "Hash value is: " << foldinghash(key);
}
