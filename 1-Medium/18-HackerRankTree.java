// You are given a pointer to the root of a binary tree. You need to print the level order 
// traversal of this tree. In level order traversal, we visit the nodes level by level from 
// left to right. You only have to complete the function. 


import java.util.*;

class Node int data;
Node left;
Node right;

public static void levelOrder(Node root) {
  if (root == null) return;

  LinkedList<Node> queue = new LinkedList();
  queue.add(root);

  while (!queue.isEmpty()) {
    Node current_node = queue.poll();
    System.out.print(current_node.data + " ");
    if (current_node.left != null) queue.add(current_node.left);
    if (current_node.right != null) queue.add(current_node.right); 
  }
}

public static Node insert(Node root, int data) {
  
}