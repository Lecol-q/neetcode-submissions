class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if(s.length() % 2 != 0){
            return false;
        }
    
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else if(!stack.empty() && s.charAt(i) == ')'){
                if(stack.peek() == '('){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(!stack.empty() && s.charAt(i) == '}'){
                if(stack.peek() == '{'){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(!stack.empty() && s.charAt(i) == ']'){
                if(stack.peek() == '['){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else {
                return false;
            }

        }
        if(!stack.empty()){
            return false;
        }
        return true;
    }
}
