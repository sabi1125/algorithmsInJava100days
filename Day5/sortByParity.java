package Day5;

import java.util.Arrays;

class SoryByParity {
  public static void sortByParity (int[] arr) {
    int right = 0;
    int left = 0;
    while (right < arr.length) {
      if(arr[right] % 2 != 0) {
        right++;
      } else {
        int temp = arr[left]; 
        arr[left] = arr[right];
        arr[right] = temp;
        right++;
        left++;
      }
    } 
    System.out.println(Arrays.toString(arr));
  }
  public static void main(String[] args) {
    sortByParity(new int[] { 0 });
  }
}
