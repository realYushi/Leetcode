class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{'){
                stack.add('}');
            }else if(c=='('){
                stack.add(')');
            }else if(c=='['){
                stack.add(']');
            }else{
                if(stack.isEmpty()){
                    return false;
                }else if(c!=stack.peek()){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
        
    }
}