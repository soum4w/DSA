/*
breaks
   /
  /
 /
/


\ 
 \
  \
   \
survives

At some point they cross.

breaks ≈ survives

That is where: max(breaks, survives) is minimized.

Suppose: mid = (low + high)/2

and we find:

breaks = 2
survives = 7

Then: survives > breaks

The surviving side is the bottleneck.

We need: larger k

because:

breaks increases
survives decreases

So: low = mid + 1;

Now suppose:

breaks = 8
survives = 3

Then: breaks > survives

The breaking side is the bottleneck.

Need: smaller k

So: high = mid - 1;

*/

//TC: O(eggs × log floors) 
//without opimization: TC O(E*F^2);

package DynamicProgramming.MatrixChainMultiplication;

import java.util.Arrays;

public class EggDroppingOptimizedBinarySearch {
    static int[][] dp;
    static int solve(int eggs, int floors){
        if(floors==0 || floors==1) return floors;
        if(eggs == 1) return floors;
        if(dp[eggs][floors]!=-1) return dp[eggs][floors];
        int minAttempts = Integer.MAX_VALUE;
        int low= 1, high = floors;
        while (low<=high) {
            int k = low+(high-low)/2;
            int breaks = solve(eggs-1, k-1);
            int survives = solve(eggs, floors-k);
            int temp = 1+ Math.max(breaks, survives);
            minAttempts = Math.min(minAttempts, temp);
            if(breaks>survives) high = k-1;
            else low= k+1;
        }
        return dp[eggs][floors] = minAttempts;
    }
    public static void main(String[] args) {
        int eggs = 2; 
        int floors = 10;
        dp = new int[eggs+1][floors+1];
        for(int[] row: dp) Arrays.fill(row, -1);
        System.out.println(solve(eggs, floors));
    }
}
