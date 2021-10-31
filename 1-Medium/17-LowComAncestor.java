// Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST. 

// The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants.

// Given binary search tree: root=[6,2,8,0,4,7,9,null,null,3,5]

// p = 2, q = 8

// Output: 6
// Explanation: The LCA of nodes 2 and 8 is 6.

/*
Definition for a binary tree node.
public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}
 */


class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (p.val < root.val && q.val < root.val) {
      return lowestCommonAncestor(root.left, p, q);
    } else if (p.val > root.val && q.val > root.val) {
      return lowestCommonAncestor(root.right, p, q);
    } else {
      return root;
    }
  }
}