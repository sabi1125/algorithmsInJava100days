package week1.Day7;

class ClimbingStairs {
  public static int climbingStairs(int n) {
    if (n == 1) {
      return 1;
    }
    int first = 1;
    int second = 2;
    for (int i = 3; i <= n; i++) {
      int third = first + second;
      first = second;
      second = third;
    }
    return second;
  }

  public static void main (String[] args) {
    climbingStairs(5);
  }
}

