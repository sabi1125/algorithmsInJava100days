package Day3.primitiveDataStructures;
import java.util.Arrays;

public class TheArray {
  public static void main (String[] args) {
    String[] colors = new String[5];
    colors[0] = "Purple";
    colors[1] = "Blue";
    
    // Alternative way to declare array when you know how many elements it has

    int[] numbers = { 100, 200 };
    // when you make array like this we wont be able to change the size;

    //loop the array

    for (int i = 0; i < colors.length; i ++) {
      System.out.println(colors[i]);
    }

    for (int i = numbers.length - 1; i >= 0; i--) {
      System.out.println(numbers[i]);
    }

    // enhanced for loop to loop through array

    for (String color: colors) {
      System.out.println(color);
    }

    // loop with stream

    Arrays.stream(colors).forEach(System.out::println);
  }
}

