package Day3.primitiveDataStructures;

import java.util.Stack;

class TheStack {
  public static void main (String[] args) {

    // stack extends vector which implements list
    // Have to be careful when to use stack because it is slower
    
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    System.out.println(stack.peek());
    System.out.println(stack.pop());
  }
}
