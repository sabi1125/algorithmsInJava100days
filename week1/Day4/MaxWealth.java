package Day4;

class MaxWealth {
  public static int maxWealth(int[][] accounts) {
    int maxWealth = 0;
    for( int i = 0; i < accounts.length; i++ ) {
      int totalWealth = 0;
      for( int j = 0; j < accounts[i].length; j++ ) {
        totalWealth += accounts[i][j];
      }
      if(totalWealth > maxWealth) {
        maxWealth = totalWealth;
      }
    }
    return maxWealth;
  }

  public static void main (String[] args) {
     System.out.println(maxWealth(new int[][] {{1,5} , {7,3}, {3,5}}));
  }
}
