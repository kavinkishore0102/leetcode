class Solution {
    public int secondHighest(String s) {
        int max = -1;
        int sec = -1;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(Character.isDigit(ch)){
                int n = ch - '0';
                
                if(n > max) {
                    sec = max;
                    max = n;
                } else if (n < max && n > sec) {
                    sec = n;
                }
            }
        }
        
        return sec;
    }
}