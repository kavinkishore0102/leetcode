class Solution {
    public int minOperations(String s) {
        boolean isSorted = true;
        char[] cs = s.toCharArray();
        int n = cs.length;
        char mn = cs[0], mx = cs[0];
        
        // Find min, max, and check if already sorted in one pass
        for (int i = 1; i < n; ++i) {
            mn = (char) Math.min(mn, cs[i]);
            mx = (char) Math.max(mx, cs[i]);
            if (cs[i] < cs[i - 1]) {
                isSorted = false;
            }
        }
        
        // Case 1: Already sorted
        if (isSorted) {
            return 0;
        }
        
        // Case 2: Length 2 and unsorted is impossible (cannot sort proper substring)
        if (n == 2) {
            return -1;
        }
        
        // Case 3: Min is already at the start or Max is already at the end
        if (cs[0] == mn || cs[n - 1] == mx) {
            return 1;
        }
        
        // Case 4: Min or Max is somewhere in the interior
        for (int i = 1; i < n - 1; ++i) {
            if (cs[i] == mn || cs[i] == mx) {
                return 2;
            }
        }
        
        // Case 5: Otherwise
        return 3;
    }
}