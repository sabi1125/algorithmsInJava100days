package Day3.primitiveDataStructures;
import java.util.Arrays;

class TwoDArray {
  public static void main (String[] args) {
    char[][] board = new char[3][3];
    for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
      board[i][j] = '-';
      }
    }
// alternate way to create 2d arrays

    char[][] boardTwo = new char[][] {
      new char[] {'o','-','-'},
      new char[] {'-','0','-'},
      new char[] {'-','-','o'},
    };

    board[0][0] = '0';
    board[1][0] = '0';
    board[2][0] = '0';

    // when the array is a 2d array we have to change it to deepToString
    System.out.println(Arrays.deepToString(boardTwo));
    System.out.println(Arrays.deepToString(board));
  }
}
