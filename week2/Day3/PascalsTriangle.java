package week2.Day3;

import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
  public static List<List<Integer>> generate(int numRows) {
   List<List<Integer>> triangle = new ArrayList<List<Integer>>(); 
   triangle.add(new ArrayList<>());
   triangle.get(0).add(1);
   for (int rowNum = 1; rowNum < numRows; rowNum++) {
     List<Integer> row = new ArrayList<>();
     List<Integer> prevRow = triangle.get(rowNum - 1);
     row.add(1);
     for (int j = 1; j < rowNum; j++) {
       row.add(prevRow.get(j-1) + prevRow.get(j));
     }
     row.add(1);
     triangle.add(row);
   }
   return triangle;
  }

  public static void main (String[] args) {
    System.out.println(generate(5));
  }
}
