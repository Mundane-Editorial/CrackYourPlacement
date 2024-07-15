package Day_2;

import java.util.*;
public class valid_parenthesis_20 {
    public static void main(String args[]){
        String str = "()[]{}";
        System.out.println(isValid(str));
    }

    private static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(')
                s.push(')');
            else if (ch == '[')
                s.push(']');
            else if (ch == '{')
                s.push('}');
            else {
                if (s.isEmpty() || s.peek() != ch) {
                    return false;
                }
                s.pop();
            }
        }
        return s.isEmpty();
    }
}
