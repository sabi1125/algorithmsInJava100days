package Day2;

class LongestCommonPrefix {
  public static String longestCommonPrefix(String[] strs) {
    for (int i = 0; i < strs[0].length(); i ++) {
      char c = strs[0].charAt(i);
      for (int j = 1; j < strs.length; j ++) {
        if(i == strs[j].length() || strs[j].charAt(i) != c) {
          System.out.println(i);
          System.out.println(strs[j]);
          return strs[0].substring(0, i);
        }
      }
    }
    return strs[0];
  }

  public static void main (String[] args) {
    System.out.print(longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
  }
}
