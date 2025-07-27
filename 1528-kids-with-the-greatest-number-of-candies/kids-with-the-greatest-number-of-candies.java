class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        ArrayList<Boolean> flags = new ArrayList<>();
        
        for (int i = 0; i < len; i++) {
            int temp = candies[i] + extraCandies;
            boolean hasMax = true;

            for (int j = 0; j < len; j++) {
                if (temp < candies[j]) {
                    hasMax = false;
                    break;
                }
            }

            flags.add(hasMax);
        }
        return flags;
    }
}
