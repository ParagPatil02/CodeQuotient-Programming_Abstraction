/*
Find the merge point of two lists

As a linked list contains nodes, a node can belong to multiple lists as well.

So, given two linked lists, find out if there exists a common node where both the linked lists merge. If it exists, then return that node else return NULL

Example: The merge point for the below two linked lists is 5.

Complete the function findMergePoint() which takes the head node of two linked lists as parameters, and returns the merging node (if exists, otherwise returns NULL).

Note: The linked lists must retain their original structure after the function returns.
*/



class Result {
    static Node findMergePoint(Node head1, Node head2) {
      Set <Node> node = new HashSet<>();
      while(head1!=null){
        node.add(head1);
        head1=head1.next;
      }
      while(head2!=null){
        if(node.contains(head2)){
          return head2;
        }
        head2=head2.next;
      }
      return null;
    }
  }