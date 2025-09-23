import java.util.*;

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);

        Set<Integer> uniqueSet = new LinkedHashSet<>();

        int i = nums.length - 1;
        while (uniqueSet.size() < k && i >= 0) {
            uniqueSet.add(nums[i]);
            i--;
        }

        int[] result = new int[uniqueSet.size()];
        int index = 0;
        for (int val : uniqueSet) {
            result[index++] = val;
        }

        return result;
    }
}
