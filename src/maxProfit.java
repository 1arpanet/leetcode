public class maxProfit {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if (n==0){
            return 0;
        }
        int[] dp=new int[n-1];
        int min=prices[0];
        dp[0]=prices[1]-prices[0];
        int max=Math.max(0,dp[0]);
        for (int i=1;i<n-1;i++){
            if (prices[i]<min){
                min=prices[i];
            }
            dp[i]=Math.max(dp[i-1],prices[i+1]-min); //用max保存每次最大的值，就不必用dp[] 啦！！！
            if (dp[i]>max){
                max=dp[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        maxProfit test=new maxProfit();
        int[] prices={7,6,4,3,1};
        System.out.println(test.maxProfit(prices));
    }
    public int maxProfit2(int[] prices) {
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}
