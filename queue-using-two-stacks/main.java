import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static Stack<Integer> newStack = new Stack<Integer>();
    private static Stack<Integer> oldStack = new Stack<Integer>();


    private static void Enqueue(int val) {
        newStack.push(val);
    }

    private static void Dequeue() {
        if(oldStack.isEmpty())
            refreshOldStack();
        oldStack.pop();
    }

    private static void refreshOldStack() {
        while(!newStack.isEmpty())
            oldStack.push(newStack.pop());
    }

    private static void printTop() {
        if(oldStack.isEmpty())
            refreshOldStack();
        System.out.printf("%d\n", oldStack.peek());
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n > 0) {
            int query = in.nextInt();
            switch(query) {
                case 1:
                    int val = in.nextInt();
                    Enqueue(val);
                    break;
                case 2:
                    Dequeue();
                    break;
                case 3:
                    printTop();
                    break;
            }
            n--;
        }
    }
}
