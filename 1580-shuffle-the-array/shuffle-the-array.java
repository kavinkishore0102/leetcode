class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];
        int ind = 0;

        for(int i = 0; i < nums.length / 2; i++){
            ans[ind++] = nums[i];
            ans[ind++] = nums[n++];
        }

        return ans;
    }
}