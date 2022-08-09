package Day4;

import java.util.Arrays;

class SquaresOfSorted {
  public static int[] sortedSquares(int[] nums) {
    int[] squares = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      squares[i] = nums[i] * nums[i];
    }
    Arrays.sort(squares);

    return squares;
  }

  public static void main (String[] args) {
    System.out.println(Arrays.toString(sortedSquares(new int[] { -7,-3,2,3,11 })));
  }
}
