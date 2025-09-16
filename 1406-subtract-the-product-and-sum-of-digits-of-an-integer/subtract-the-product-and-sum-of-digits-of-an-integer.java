class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, mul = 1;
        while(n != 0){
            int l = n % 10;
            sum += l;
            mul *= l;
            n = n / 10;
        }
        return mul-sum;
    }
}