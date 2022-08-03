import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FrequencySort {
  // day 1 of 100 first algorithm in java 
  /* Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
     Return the sorted string. If there are multiple answers, return any of them.

     leetcode   - No.451 sorting characters by frequency.
     difficulty - medium
  */
  public static String sort(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    List<Character> chars = new ArrayList<>(map.keySet());
    Collections.sort(chars, (a, b) -> map.get(b) - map.get(a));
    StringBuilder str = new StringBuilder();

    for (char c : chars) {
      int copies = map.get(c);
      for (int i = 0; i < copies; i++) {
        str.append(c);
      }
    }
    return str.toString();
  }

  public static void main (String[] args) {
    System.out.print(sort("rrraaaacceaar"));
  }
}
