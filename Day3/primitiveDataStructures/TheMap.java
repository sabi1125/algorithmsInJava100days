package Day3.primitiveDataStructures;
import java.util.HashMap;
import java.util.Map;

class TheMap {
  public static void main (String[] args) {
    // collection of key value paris
    // keys cannot be duplicates
    
    Map<Integer, Person> map = new HashMap<>(); 
    map.put(1, new Person("sabir"));
    map.put(2, new Person("swornim"));
    map.put(3, new Person("sudha"));
    System.out.println(map);
    System.out.println(map.keySet());
    System.out.println(map.entrySet());
    System.out.println(map.values());
  }
  
  record Person(String name){}
}
