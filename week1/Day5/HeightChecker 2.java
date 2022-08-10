package Day5;

import java.util.Arrays;

class HeightChecker {
  public static int heightChecker(int[] heights) {
    int[] expected = new int[heights.length];
    int count = 0;
    for(int i = 0; i < heights.length; i++) {
      expected[i] = heights[i];
    }
    Arrays.sort(expected);
    for(int i = 0; i < heights.length; i++) {
      if(expected[i] != heights[i]) {
        count++;
        System.out.println(count);
      }
    }
    return count;
  }

  public static void main (String[] args) {
    heightChecker(new int[] { 1,1,4,2,1,3 });
    heightChecker(new int[] { 5,1,2,3,4 });
    heightChecker(new int[] { 1,2,3,4,5 });
  }
}
