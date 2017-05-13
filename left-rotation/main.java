import java.io.*;
import java.util.*;

public class Solution {

     private static int[] rotateArray(int[] arr, int step) {
        int steps = step % arr.length;
        int[] result = new int[arr.length];
        int count = arr.length - steps;

        for(int i = 0; i < arr.length; i++) {
            if(count == arr.length - 1) {
                result[count] = arr[i];
                count = 0;
            } else {
                result[count] = arr[i];
                count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        input = in.nextLine();
        String[] arr_s = input.split("\\s");
        int n_arr = Integer.parseInt(arr_s[0]);
        int n_shift = Integer.parseInt(arr_s[1]);
        int[] arr = new int[n_arr];
        for(int i =0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int[] result = rotateArray(arr, n_shift);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
