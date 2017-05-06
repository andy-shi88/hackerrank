import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static boolean isSameLand(int x1, int v1, int x2, int v2) {
        boolean result = false;
        int count_a = 0;
        int count_b = 0;
        while(x1 < Integer.MAX_VALUE && x2 < Integer.MAX_VALUE) {
            x1 += v1;
            x2 += v2;
            if(x1 == x2) {
                result = true;
                break;
            }
            if((x1 > x2 && v1 > v2) || (x1< x2 && v1 < v2)) {
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        if(isSameLand(x1, v1, x2, v2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
