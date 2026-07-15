class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = -1;
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            if (words.length > max) {
                max = words.length;
            }
        }
        return max;
    }
}