import java.io.*;
import java.util.*;

public class Solution {

    private static int getArraySum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = 0;
       n = in.nextInt();
       int[] numbers = new int[n];
       for(int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
       }
       int sum = getArraySum(numbers);
       System.out.println(sum);
    }
}
