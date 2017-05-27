/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as:
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    boolean result = false;
    if(head != null) {
        Node snail = head; //snail move one node at a time
        Node rabbit = head; // rabbit move two nodes at a time
        while(rabbit.next != null) {
           snail = snail.next;
           if(rabbit.next.next != null) {
                rabbit = rabbit.next.next;
            } else {
               break;
           }
            if(rabbit == snail) {
               result = true;
               break;
           }
        }
    }else {
        result = false;
    }
    return result;
}
