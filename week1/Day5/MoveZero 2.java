package Day5;

import java.util.Arrays;

class MoveZero {
  public static void moveZeroes (int[] arr) {
    int right = 0;
    int left = 0;
    while ( right < arr.length ) {
      if(arr[right] == 0) {
        right++;
      } else {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
        right++;
        left++;
      }
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void main (String[] args) {
    moveZeroes(new int[] { 1,0,2,0,3 });
  }
}
