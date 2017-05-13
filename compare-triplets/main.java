import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] aPoint, int[] bPoint){
        int[] result = new int[2];
        for(int i = 0; i < aPoint.length; i++) {
            if(aPoint[i] > bPoint[i]) {
                result[0] += 1;
            } else if(aPoint[i] < bPoint[i]){
                result[1] += 1;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] alicePoint = new int[3];
        int[] bobPoint = new int[3];
        //in alicepoint
        for(int i =0; i < alicePoint.length; i++) {
            alicePoint[i] = in.nextInt();
        }
        //in bobPoint
        for(int i =0; i < bobPoint.length; i++) {
            bobPoint[i] = in.nextInt();
        }

        int[] result = solve(alicePoint, bobPoint);
        String separator = "", delimiter = " ";
        for (Integer value : result) {
            System.out.print(separator + value);
            separator = delimiter;
        }
        System.out.println("");


    }
}
