package week1.Day6;

import java.util.LinkedList;
import javax.swing.tree.TreeNode;


class Solution {
  public int minDepth(TreeNode root) {
    LinkedList<Pair<TreeNode, Integer>> stack = new LinkedList<>();
    if (root == null) {
      return 0;
    }
    else {
      stack.add(new Pair(root, 1));
    }

    int min_depth = Integer.MAX_VALUE;
    while (!stack.isEmpty()) {
      Pair<TreeNode, Integer> current = stack.pollLast();
      root = current.getKey();
      int current_depth = current.getValue();
      if ((root.left == null) && (root.right == null)) {
        min_depth = Math.min(min_depth, current_depth);
      }
      if (root.left != null) {
        stack.add(new Pair(root.left, current_depth + 1));
      }
      if (root.right != null) {
        stack.add(new Pair(root.left, current_depth +1));
      }
    }
    return min_depth;
  }
}
