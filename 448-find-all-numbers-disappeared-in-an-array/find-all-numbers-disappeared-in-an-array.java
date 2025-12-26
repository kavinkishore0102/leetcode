class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        for(int num : set){
            list.add(num);
        }
        
         List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}