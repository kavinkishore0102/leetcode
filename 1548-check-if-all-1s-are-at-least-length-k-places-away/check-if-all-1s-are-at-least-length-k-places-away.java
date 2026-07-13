class Solution {
    public boolean kLengthApart(int[] nums, int k) {

        int count = 0;
        boolean firstOneFound = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {

                if (firstOneFound && count < k) {
                    return false;
                }

                firstOneFound = true;
                count = 0;
            }
            else if (firstOneFound) {
                count++;
            }
        }

        return true;
    }
}