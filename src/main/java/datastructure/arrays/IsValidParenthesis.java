package datastructure.arrays;

import java.util.Stack;

import datastructure.StackFullException;
//[]()((())
public class IsValidParenthesis {
//(5+4)*{3+4}
    boolean isValid(char[] expression) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < expression.length; i++) {
            if (expression[i] == '{' || expression[i] == '[' || expression[i] == '(') {
                stack.push(expression[i]);
            }

            else {
                char top=stack.pop();
                switch (expression[i]) {
                    case ')':
                        if (top != '(')
                            return false;
                    case '}':
                        if (top != '{')
                            return false;
                    case ']':
                        if (top != '[')
                            return false;
                }
            }

        }
        return stack.isEmpty();
    }


}