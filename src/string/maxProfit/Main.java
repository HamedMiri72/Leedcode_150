package string.maxProfit;

public class Main {

    public static void main(String[] args) {


        int[] prices = {7,2,5,3,1,2};

        Solution solution = new Solution();

        int profit = solution.maxProfit(prices);

        System.out.println(profit);

    }
}
