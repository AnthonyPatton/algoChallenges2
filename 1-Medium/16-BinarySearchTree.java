Given a binary tree, write a function to test if the tree is a binary search tree.

private class Node {
  private int value;
  private Node right;
  private Node left;
}

public boolean isBST(Node n) {
  return isBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
}

public boolean isBST(Node n, int min, int max) {
  if (n == null) return true;
  if (n < min || n > max) return false;
  return isBST(n.left,)
}