class Solution {
    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        for(int i = 0; i < prices.length; i++){
            result[i] = prices[i];
            for(int j = i + 1; j < prices.length; j++){
                int num = prices[i] - prices[j];
                if(num >= 0){
                    result[i] = num;
                    break;
                }
            }   
        }
        return result;
    }
}