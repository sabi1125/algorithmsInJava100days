package Day4;

import java.util.List;
import java.util.Stack;

class FizzBuzz {
  public static List<String> fizzBuzz(int n) {
    List<String> stack = new Stack<>();

    for( int i = 1; i <= n; i++ ) {
      if( i % 3 == 0 && i % 5 == 0 ) {
        stack.add("FizzBuzz");
      } else if( i % 5 == 0 ) {
        stack.add("Buzz");
      } else if (i % 3 == 0) {
        stack.add("Fizz");
      } else {
        stack.add(String.valueOf(i));
      }
    }
    return stack;
  }

  public static void main (String[] args) {
    System.out.println(fizzBuzz(15));
  }
}
