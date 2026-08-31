class Solution {
    public int calculate(String s) {

        // Stack stores previous result and sign before '('
        Stack<Integer> stack = new Stack<>();

        // res -> current calculated result
        // curr -> current number being formed
        // sign -> current sign (1 for '+', -1 for '-')
        int res = 0;
        int curr = 0;
        int sign = 1;

        // Traverse each character
        for (char c : s.toCharArray()) {

            // Build multi-digit numbers
            if (Character.isDigit(c)) {
                curr = curr * 10 + (c - '0');
            }

            // Process '+' operator
            else if (c == '+') {
                res += curr * sign;
                sign = 1;
                curr = 0;
            }

            // Process '-' operator
            else if (c == '-') {
                res += curr * sign;
                sign = -1;
                curr = 0;
            }

            // Start of a new sub-expression
            else if (c == '(') {
                stack.push(res);   // Save current result
                stack.push(sign);  // Save current sign

                // Reset for evaluating expression inside parentheses
                res = 0;
                sign = 1;
                curr = 0;
            }

            // End of current sub-expression
            else if (c == ')') {
                // Finish current expression
                res += curr * sign;
                curr = 0;

                // Apply the sign before '('
                res *= stack.pop();

                // Add the previous result
                res += stack.pop();
            }

            // Ignore spaces automatically
        }

        // Add the last number
        res += curr * sign;

        return res;
    }
}