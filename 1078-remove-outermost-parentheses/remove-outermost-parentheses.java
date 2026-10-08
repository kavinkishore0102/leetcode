class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push('(');

                if(stack.size() > 1) {
                    result.append('(');
                }
            }
            if(s.charAt(i) == ')') {
                if(stack.size() > 1) {
                    result.append(')');
                }
                stack.pop();
            }
        }
        return result.toString();
    }
}