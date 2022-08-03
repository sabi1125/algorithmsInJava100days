import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MaxDuplicate {
  public static int maxDuplicate(String str) {
    Map<Character, Integer> map = new HashMap<>();
    for(char c : str.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    List<Integer> nums = new ArrayList<>(map.values());
    int max = 0;
    for (int i = 0; i < nums.size(); i++) {
      if (nums.get(i) > max) {
        max = nums.get(i);
      }
    }
    return max;
  }

  public static void main (String[] args) {
    System.out.print(maxDuplicate("rrrrangge"));
  }
}
