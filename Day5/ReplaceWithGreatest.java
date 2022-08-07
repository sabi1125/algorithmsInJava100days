package Day5;

import java.util.Arrays;

class ReplaceWithGreatest {
  // given array
  // replace the ith element to the greatest element on its right side;
  public static int[] replaceRight(int[] arr) {
    for( int i = 0; i < arr.length; i++ ) {
      int max = 0;
      for( int j = i+1; j < arr.length; j++ ) {
        if(arr[j] > max) {
          max = arr[j];
        } 
      }
    if(i == arr.length - 1) {
      max = -1;
    }
      arr[i] = max;
    }
    return arr;
  }
  public static void main(String[] args) {
    System.out.println(Arrays.toString(replaceRight(new int[] {17,18,5,4,6,1})));
    System.out.println(Arrays.toString(replaceRight(new int[] {400})));
    System.out.println(Arrays.toString(replaceRight(new int[] {0,0,0,0,0})));
  }
}
