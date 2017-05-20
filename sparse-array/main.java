import java.io.*;
import java.util.*;

public class Solution {
    private static int[] checkString(String[] strings, String[] queries) {
        int[] results = new int[queries.length];
        for(int i =0; i < queries.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if(strings[j].equals(queries[i])) {
                    results[i] += 1;
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String na = in.nextLine();
        String[] strings = new String[Integer.parseInt(na)];
        for(int i = 0; i < strings.length; i++) {
            strings[i] = in.nextLine();
        }
        String nb = in.nextLine();
        String[] queries = new String[Integer.parseInt(nb)];
        for(int i = 0; i < queries.length; i++) {
            queries[i] = in.nextLine();
        }
        int[] result = checkString(strings, queries);
        for(int i =0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
