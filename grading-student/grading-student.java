import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        int bias = 2;
        int min_score = 40;
        int scale = 5;
        for(int i = 0; i < grades.length; i++) {
            if(grades[i] >= min_score - bias) {
                int remainder = grades[i] % scale;
                if(remainder >= scale - bias) {
                    grades[i] = grades[i] + (scale - remainder);
                }
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
