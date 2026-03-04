#include <iostream>
#include <algorithm>
#include <cstring>
using namespace std;

int dp[10][10];   //global matrix 

int knapsack(int wt[], int val[], int w, int n){

    if(n==0 || w==0)
        return 0;

    if(dp[w][n] != -1)
        return dp[w][n];

    if(wt[n-1] > w)
        return dp[w][n] = knapsack(wt, val, w, n-1);

    return dp[w][n] = max(
        val[n-1] + knapsack(wt, val, w-wt[n-1], n-1),
        knapsack(wt, val, w, n-1)
    );
}

int main(){

    memset(dp, -1, sizeof(dp));

    int wt[] = {1,3,4,5};
    int val[] = {1,4,5,7};
    int w = 7;
    int n = 4;

    cout << "Maximum Value: " << knapsack(wt, val, w, n);

    return 0;
}