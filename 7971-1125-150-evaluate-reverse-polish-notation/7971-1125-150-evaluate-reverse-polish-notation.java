class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if(!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")){
                int num = Integer.parseInt(token);
                stack.push(num);
            }
            else if(token.equals("+")){
                int num1 = stack.pop();
                int num2 = stack.pop();

                int result = num2 + num1;
                stack.push(result);
            }
            else if(token.equals("-")){
                int num1 = stack.pop();
                int num2 = stack.pop();

                int result = num2 - num1;
                stack.push(result);
            }
            else if(token.equals("*")){
                int num1 = stack.pop();
                int num2 = stack.pop();

                int result = num2 * num1;
                stack.push(result);
            }
            else if(token.equals("/")){
                int num1 = stack.pop();
                int num2 = stack.pop();

                int result = num2 / num1;
                stack.push(result);
            }
        }
        return stack.peek();
    }
}