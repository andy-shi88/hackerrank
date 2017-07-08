import java.io.*;
import java.util.*;

public class Solution {
    
    public static void bubbleSort(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
		    // Track number of elements swapped during a single array traversal
		    int numberOfSwaps = 0;
		    
		    for (int j = 0; j < arr.length - 1; j++) {
		        // Swap adjacent elements if they are in decreasing order
		        if (arr[j] > arr[j + 1]) {
		        	int temp = arr[j];
		        	arr[j] = arr[j+1];
		        	arr[j+1] = temp;
		            numberOfSwaps++;
		        }
		    }
		    count += numberOfSwaps;
		}
		System.out.println("Array is sorted in " + count + " swaps.");
		System.out.println("First Element: " + arr[0]);
		System.out.println("Last Element: " + arr[arr.length - 1]);
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        bubbleSort(arr);
    }
}