public class maxProfitii {
    public int maxProfit(int[] prices) {
        int max=0;
        for (int i=1;i<prices.length;i++){
            if (prices[i]>prices[i-1]){
                max+=prices[i]-prices[i-1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        maxProfit test=new maxProfit();
        int[] prices={1,7,2,3,6,7,6,7};
        System.out.println(test.maxProfit2(prices));
    }
    public int maxProfit2(int[] prices) {
        int i=0;
        int v=prices[0];
        int p=prices[0];
        int max=0;
        while(i<prices.length-1){
            while(i<prices.length-1&&prices[i]>=prices[i+1])
                i++;
            v=prices[i];
            while(i<prices.length-1&&prices[i]<=prices[i+1])
                i++;
            p=prices[i];
            max+=p-v;
        }
        return max;
    }
}
