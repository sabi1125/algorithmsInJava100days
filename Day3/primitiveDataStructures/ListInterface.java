package Day3.primitiveDataStructures;
import java.util.ArrayList;
import java.util.List;

class ListInterface {
  public static void main (String[] args) {
    
    //this type of list is immutable
    
    List<String> colorsUnmodifiable = List.of(
        "blue",
        "yellow"
        );



    List<String> colors = new ArrayList<>();
    colors.add("blue");
    colors.add("purple");
    System.out.println(colors.contains("blue"));
    System.out.println(colors);

    for (String color : colors) {
      System.out.println(color);
    }

    colors.forEach(System.out::println);

    // not used often unless i need access to the intex itself
    for (int i = 0; i < colors.size(); i++) {
      System.out.println(colors.get(i));
    }
  }
}
