package Day3.primitiveDataStructures;
import java.util.LinkedList;
import java.util.Queue;

class TheQueue {
  public static void main (String[] args) {
    Queue<Person> supermarket = new LinkedList<>();
    supermarket.add(new Person("sabir", 26));
    supermarket.add(new Person("swornim", 24));
    supermarket.add(new Person("sudha", 30));
    System.out.println(supermarket.peek());

    // removes the first element
    // queue.remove() actually returns an exception when the queue is empty 
    
    System.out.println(supermarket.poll());
    System.out.println(supermarket.peek());

  }

  static record Person(String name, int age) {}
}
