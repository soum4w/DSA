public class KnapsackRecursive{

    static int max(int a, int b){
        return (a>b)? a:b;
    }

    static int knapsack(int[] wt, int[] val, int capacity, int size){
        if(capacity==0 || size ==0) return 0;

        if(capacity>= wt[size-1]) return max(
            val[size-1] + knapsack(wt, val, capacity - wt[size-1], size-1),
            knapsack(wt, val, capacity, size-1)
        );
        else return knapsack(wt, val, capacity, size-1);
    }
}

