import java.io.*;
import java.util.*;

public class Solution {
    private static boolean isAllTrue(boolean[] chars) {
        for(int i=0; i < chars.length; i++) {
            if(!chars[i]) {
                return false;
            }
        }
        return true;
    }
    private static boolean isPangram(String input) {
        boolean result = false;
        input = input.toUpperCase();
        boolean[] characters = new boolean[26];
        for(int i =0; i < input.length(); i++) {
            int key_code = (int)input.charAt(i);
            int alpha_code = key_code % 26;
            characters[alpha_code] = true;
        }
        result = isAllTrue(characters);
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        if(isPangram(input)) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
}
