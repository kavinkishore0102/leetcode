class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[] = new int[2];

        for(int i = 0; i < nums.length; i++){
            int flg = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == i+1){
                    flg = 1;
                    break;
                }
            }
            if (flg == 0) ans[1] = i + 1; 
        }

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]) ans[0] = nums[i];
            }
        }
        return ans;
    }
}