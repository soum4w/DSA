package DynamicProgramming.UnboundedKnapsack;

public class RodCutting {

    static int rodCutting(int[] price, int N){
        int[] length = new int[N];
        for(int i=0; i<N; i++){
            length[i] = i+1;
        }
        int[][] dp = new int[N+1][N+1];

        for(int i=1; i<=N; i++){
            for(int len=1; len<=N; len++){
                dp[i][len] = dp[i-1][len];
                if(length[i-1] <= len) dp[i][len] = Math.max(dp[i-1][len],
                                                        price[i-1] + dp[i][len-length[i-1]]
                                                    );
            }
        }
        return dp[N][N];

    }
    public static void main(String[] args) {
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(rodCutting(price, 8));

    }
}
