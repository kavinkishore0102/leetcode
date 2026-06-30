class Solution {
    public long removeZeros(long n) {
        String str = Long.toString(n);
        String res = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != '0'){
                res += str.charAt(i);
            }
        }
        long num = Long.parseLong(res);
        return num;
    }
}