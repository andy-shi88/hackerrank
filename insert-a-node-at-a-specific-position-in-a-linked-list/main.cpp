/*
  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* InsertNth(Node *head, int data, int position)
{
    if(head != NULL) {
        int count = 0;
        Node *a = head;
        Node *b = head;
        while(count != position) {
            b = a;
            a = a->next;
            count++;
        }
        Node *n = (Node*)malloc(sizeof(Node));
        n->data= data;
        if(position > 0) {
            n->next = b->next;
            b->next = n;
        } else {
            n->next = head;
            head = n;
        }
    } else {
        head->data = data;
        head->next = NULL;
    }

    return head;
}
