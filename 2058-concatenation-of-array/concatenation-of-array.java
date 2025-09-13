class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len*2];
        int x = 0;

        for(int i = 0; i < len; i++, x++){
            arr[x] = nums[i];
        }
        for(int i = 0; i < len; i++, x++){
            arr[x] = nums[i];
        }
        return arr;
    }
}