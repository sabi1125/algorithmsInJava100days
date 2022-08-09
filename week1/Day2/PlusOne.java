package Day2;

import java.util.Arrays;

class PlusOne {
  public static int[] plusOne (int[] digits) {
    int n = digits.length;

    for (int idx = n - 1; idx >= 0; --idx) {
      if (digits[idx] == 9) {
        digits[idx] = 0;
      } else {
        digits[idx]++;
        return digits;
      }
    }
    digits = new int[n+1];
    digits[0] = 1;
    return digits;
  }

  public static void main (String[] args) {
    System.out.println(Arrays.toString(plusOne(new int[] { 9,9,9 })));
  }
}
