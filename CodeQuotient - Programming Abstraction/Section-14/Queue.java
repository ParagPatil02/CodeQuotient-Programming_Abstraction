/*
Implement Queue using two stacks

Stack and Queues are two popular data structures. Can we implement one of them given the other?

In this question, given two stacks you have to implement a queue using them. In other words, you are allowed to do push and pop on these two stacks only, but the effect outside must come as a FIFO list (queue).

Complete the methods that are given in the editor.
*/





/* push(int), pop(), isEmpty(), isFull() are available on the given Stack. */
class Queue {
    void enqueue(CQStack st1, CQStack st2, int item) {
      st1.push(item);
    }
    int dequeue(CQStack st1, CQStack st2) {
      if(st2.isEmpty() == true){
        if(st1.isEmpty() == true)
          return -1;
        else
        {
          while(st1.isEmpty() == false){
            int temp = st1.pop();
            st2.push(temp);
          }
        }
      }
      return st2.pop();
    }
  }