import java.util.ArrayList;

class Solution {
    public int minMaxGame(int[] nums) {
        if (nums.length == 1) return nums[0];  // base case

        int n = nums.length;

        while (n > 1) {   // repeat until only one element left
            ArrayList<Integer> arr = new ArrayList<>();

            for (int j = 0; j < n / 2; j++) {   // loop for newNums
                if (j % 2 == 0) {
                    // even index → take min
                    if (nums[2 * j] < nums[2 * j + 1]) {
                        arr.add(nums[2 * j]);
                    } else {
                        arr.add(nums[2 * j + 1]);
                    }
                } else {
                    // odd index → take max
                    if (nums[2 * j] > nums[2 * j + 1]) {
                        arr.add(nums[2 * j]);
                    } else {
                        arr.add(nums[2 * j + 1]);
                    }
                }
            }

            // copy ArrayList back to nums
            n = arr.size();
            nums = new int[n];
            for (int k = 0; k < n; k++) {
                nums[k] = arr.get(k);
            }
        }

        return nums[0];
    }
}
