/* 
Reverse a linked list

A linked list is a collection of nodes. First node is called head node and last node called the tail node.

Now, given a pointer to the head node of a linked list, can you reverse the linked list i.e. New list must start with tail node and end at head node. So it becomes the reverse of the original list.

Example:

Original List: head -> 1 -> 2 -> 3 -> 4 -> 5 -> NULL

Reversed List: head -> 5 -> 4 -> 3 -> 2 -> 1 -> NULL

Complete the function reverseList() given in the editor, which takes the head node of a linked list as a parameter, and returns the new head of reversed list.
*/



class Result {
    static Node reverseList(Node head) {
      Node curr= head;
      Node prev=null;
      Node next=null;
      while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      }
      head=prev;
      return head;
    } 
}