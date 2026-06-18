class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int j = 1; // tracks odd indices

        for (int i = 0; i < n; i += 2) {
            if (nums[i] % 2 != 0) {          // odd number sitting at even index
                while (nums[j] % 2 != 0) {   // find an odd index holding an even number
                    j += 2;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
}