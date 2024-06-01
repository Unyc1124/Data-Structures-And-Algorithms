public class Stocks {
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(stockProfit(prices));
    }
    public static int stockProfit(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++) {
            if(buyprice < prices[i]){//profit
                int profit = prices[i]-buyprice;//todays profit
                maxProfit = Math.max(maxProfit,profit);//global
            }else{
                buyprice = prices[i];
            }
        }
        return maxProfit;
    }
}
