package Day5;

import java.util.HashSet;
import java.util.Set;

class CheckIfExist {
  // brute force
  public static boolean checkIfExist(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int iDouble = arr[i] * 2;
      for (int j = 0; j < arr.length; j++) {
        if(iDouble == arr[j]) {
          return true;
        }
      }
    }
    return false;
  }

  // hash map approach O(n);

  public static boolean hashIfExixt(int [] arr) {
    Set<Double> set = new HashSet<>();
    for(int x : arr) {
      if (set.contains((double)x/2) || set.contains((double)x * 2)) return true;
      set.add((double)x);
    }
    return false;
  }
  
  public static void main (String[] args) {
    System.out.println(checkIfExist(new int[] {10,2,5,3}));
    System.out.println(checkIfExist(new int[] {7,1,14,11}));
    System.out.println(checkIfExist(new int[] {3,1,7,11}));
  }
}
