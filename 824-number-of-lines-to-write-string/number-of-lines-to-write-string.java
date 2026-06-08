class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int count = 0;
        int lines = 1;

        for (int i = 0; i < s.length(); i++) {
            int charWidth = widths[s.charAt(i) - 'a'];

            if (count + charWidth > 100) {
                lines++;
                count = 0;
            }
            count += charWidth;
        }

        return new int[]{lines, count};
    }
}