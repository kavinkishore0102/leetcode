class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int ans[] = new int[len*2];
        int n = 0;

        for(int i = 0; i < len; i++){
            ans[n++] = nums[i];
        }
        for(int i = 0; i < len; i++){
            ans[n++] = nums[i];
        }
        return ans;
    }
}