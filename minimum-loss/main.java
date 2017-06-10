import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node[] nodes = new Node[n];
        for(int i = 0; i < n; i++) {
            int a = in.nextInt();
            Node node = new Node(i, a);
            nodes[i] = node;
        }
        Arrays.sort(nodes);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i< nodes.length; i++) {
            if(nodes[i].index < nodes[i-1].index ) {
                if(nodes[i].data - nodes[i-1].data < min)
                    min = nodes[i].data - nodes[i-1].data;
            }
        }
        System.out.printf("%d", min);
    }

    static class Node implements Comparable<Node>{
        public int index;
        public int data;
        Node(int index, int data){
            this.index = index;
            this.data = data;
        }
        public int compareTo(Node node) {
            int data_b = node.data;
            return this.data - data_b;
        }
    }
}
