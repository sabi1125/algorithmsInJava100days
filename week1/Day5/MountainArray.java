package Day5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class MountainArray {
  public static boolean mountainArray(int[] arr) {
    int n = arr.length;
    int i = 0;

    while (i+1 < n && arr[i] < arr[i+1]) 
      i++;

    if(i == 0 || i == n-1) return false;

    while (i+1 < n && arr[i] > arr[i+1]) i++;
   
    return i == n-1;
  }


  public static void main (String[] args) {
    System.out.println(mountainArray(new int[] {2,1}));
    System.out.println(mountainArray(new int[] {3,5,5}));
    System.out.println(mountainArray(new int[] {0,3,2,1}));
  }
}

