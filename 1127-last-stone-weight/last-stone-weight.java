class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < stones.length; i++) {
            arr.add(stones[i]);
        }

        while (arr.size() > 1) {
            Collections.sort(arr);
            int n = arr.size();
            int num = arr.get(n-1) - arr.get(n-2);

            arr.remove(n-1);  // remove largest
            arr.remove(n-2);  // remove second largest

            if (num > 0) {
                arr.add(num);  
            }
        }

        return arr.size() == 1 ? arr.get(0) : 0;
    }
}