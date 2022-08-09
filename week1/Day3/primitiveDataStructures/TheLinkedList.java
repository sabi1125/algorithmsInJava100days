package Day3.primitiveDataStructures;
import java.util.LinkedList;
import java.util.ListIterator;

class TheLinkedList {
  public static void main (String[] args) {
    //linked list are very expensive on memory
    LinkedList<Person> linkedList = new LinkedList<>();
    linkedList.add(new Person("sabir", 26));
    linkedList.add(new Person("swornim", 24));
    linkedList.add(new Person("sudha", 30));
    ListIterator<Person> personListIterator = linkedList.listIterator();

    while (personListIterator.hasNext()) {
      System.out.println(personListIterator.next());
    }

    while (personListIterator.hasPrevious()) {
      System.out.println(personListIterator.previous());
    }
  }

  static record Person(String name, int age) {}
}
