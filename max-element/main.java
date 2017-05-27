import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<CustomNode> stack = new Stack<CustomNode>();
        int n = in.nextInt();
        int max = Integer.MIN_VALUE;
        stack.push(new CustomNode(Integer.MIN_VALUE, Integer.MIN_VALUE));
        while(n > 0) {
            int query = in.nextInt();
            if(query == 1) {
                int value = in.nextInt();
                max = Math.max(max, value);
                stack.push(new CustomNode(value, max));
            } else if(query == 2) {
                if(!stack.isEmpty())
                    stack.pop();
                max = stack.peek().currMax;
            } else {
                System.out.printf("%d\n", max);
            }
            n--;
        }
    }
}

 class CustomNode {
        int currMax;
        int currVal;
        CustomNode(int val, int max) {
            this.currVal = val;
            this.currMax = max;
        }
    }
