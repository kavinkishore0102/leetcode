class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for (int num = left; num <= right; num++) {
            boolean covered = false;

            for (int i = 0; i < ranges.length; i++) {
                int start = ranges[i][0];
                int end = ranges[i][1];

                if (start <= num && num <= end) {
                    covered = true;
                    break;
                }
            }

            if (!covered) return false;
        }

        return true;
    }
}
