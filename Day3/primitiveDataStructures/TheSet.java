package Day3.primitiveDataStructures;
import java.util.HashSet;
import java.util.Set;

class TheSet {
  public static void main (String[] args) {
    // sets do not gurantee order
    // inplements mathematical set extraction
    // duplicates are not allowed in sets 
    // sets are kinda like Enums 
    
    Set<Ball> balls = new HashSet<>();
    balls.add (new Ball("blue"));
    balls.add(new Ball("yellow"));
    balls.add(new Ball("yellow"));
    balls.add(new Ball("red"));
    balls.add(new Ball("green"));
    System.out.println(balls.size());
    balls.forEach(System.out::println);
  }
  

 // record Ball(String color){}
  static class Ball {
    String color;
    public Ball(String color) {
      this.color = color;
    }
  }
}
