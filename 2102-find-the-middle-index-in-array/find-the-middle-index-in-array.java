class Solution {
    public int findMiddleIndex(int[] nums) {
        int res = -1;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int sum1 = 0;

            for (int j = 0; j < i; j++) {
                sum += nums[j];
            }

            for (int k = i + 1; k < nums.length; k++) {
                sum1 += nums[k];
            }

            if (sum == sum1) {
                res = i;
                break;
            }
        }

        return res;
    }
}
