#include<iostream>
using namespace std;
int divisionHash(int key,int tablesize)
{
    return key%tablesize;
}
int main()
{
    int key=12345;
    int tableszie=10;
    cout<<"Hash value is: "<<divisionHash(key,tableszie);
}

