import java.io.*;
import java.util.*;

public class Solution {

    private static long getResult(int[] arr) {
        long result = 0;
        for(int i =0; i < arr.length; i++) {
            result+= arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        long result = getResult(arr);
        System.out.println(result);
    }
}
