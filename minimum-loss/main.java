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
            long a = in.nextLong();
            Node node = new Node(i, a);
            nodes[i] = node;
        }
        Arrays.sort(nodes);
        long min = 100000000;
        for(int i = 1; i< nodes.length; i++) {
            if(nodes[i].index < nodes[i-1].index ) {
                if(nodes[i].data - nodes[i-1].data < min)
                    min = nodes[i].data - nodes[i-1].data;
            }
        }
        System.out.printf("%d", min);
    }

    static class Node implements Comparable<Node>{
        public long index;
        public long data;
        Node(long index, long data){
            this.index = index;
            this.data = data;
        }
        public int compareTo(Node node) {
            long data_b = node.data;
            if(data_b > this.data)
                return -1;
            else if(data_b < this.data)
                return 1;
            else
                return 0;
        }
    }
}
