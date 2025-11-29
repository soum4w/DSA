#include<iostream>
#include<string>
using namespace std;

int midSqaureHash(int key,int r)
{
    long long sq = 1LL * key * key; // square the key
    string s = to_string(sq);       // convert to string

    int d = s.length();             // total digits of square

    int start = (d - r) / 2;        // starting index of middle part
    string mid = s.substr(start, r);

    return stoi(mid);               // convert back to int
}

int main()
{
    int key = 60, r = 2;
    cout<<"hash is "<<midSqaureHash(key, r);
}
