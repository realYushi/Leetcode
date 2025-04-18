class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{'){
                stack.push('}');
            }else if(c=='('){
                stack.push(')');
            }else if(c=='['){
                stack.push(']');
            }else{
                if(stack.isEmpty()||c!=stack.peek()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty(); 

        
    }
}