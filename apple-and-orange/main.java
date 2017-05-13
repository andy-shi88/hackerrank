import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static void calculateFruit(int[] apple, int[] orange, int s, int t, int a, int b) {
        int app = 0;
        int org = 0;
        for(int i = 0; i < apple.length; i++) {
            int dist = a + apple[i];
            if( dist >= s && dist <= t) {
               app++;
            }
        }
        for(int i =0; i < orange.length; i++) {
            int dist = b + orange[i];
            if(dist >= s && dist <= t) {
                org++;
            }
        }
        System.out.println(app);
        System.out.println(org);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        calculateFruit(apple, orange, s, t, a, b);
    }
}
