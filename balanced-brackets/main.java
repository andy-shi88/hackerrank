import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static char TOKENS[][] = {{'{', '}'}, {'(', ')'}, {'[', ']'}};

    private static boolean isOpen(char open) {
        for(char[] carr: TOKENS) {
            if(carr[0] == open) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPair(char open, char close) {
        for(char[] carr: TOKENS) {
            if(carr[0] == open) {
                return carr[1] == close;
            }
        }
        return false;
    }

    private static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()) {
            if(isOpen(c)) {
                stack.push(c);
            } else {
                if(stack.isEmpty() || !isPair(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            if(isBalanced(s)) {
                System.out.printf("YES\n");
            } else {
                System.out.printf("NO\n");
            }
        }

    }
}
