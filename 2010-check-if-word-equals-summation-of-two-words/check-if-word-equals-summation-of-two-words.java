class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
    
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < firstWord.length(); i++) {
            int num = firstWord.charAt(i) - 'a';
            word.append(num);
        }

        StringBuilder word1 = new StringBuilder();
        for (int i = 0; i < secondWord.length(); i++) {
            int num = secondWord.charAt(i) - 'a';
            word1.append(num);
        }

        int res = Integer.parseInt(word.toString()) + Integer.parseInt(word1.toString());

        StringBuilder word2 = new StringBuilder();
        for (int i = 0; i < targetWord.length(); i++) {
            int num = targetWord.charAt(i) - 'a';
            word2.append(num);
        }

        return res == Integer.parseInt(word2.toString());
    }
}
