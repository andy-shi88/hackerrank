import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    if(arr[i] - arr[j] < min){
                        min = arr[i]-arr[j];
                    }
                }
            }
        }
        System.out.printf("%d", min);
    }
}
