// Given a string containing just the characters (){}[], determine if the input string is valid.

// An input string id valid if:

// 1. Open brackets must be closed by the same type of brackets.
// 2. Open brackets must be closed in the correct order.

// Input: "()"
// Output: true

class Solution {
  public boolean isValid(String s) {
    if (s.length() % 2 != 0) return false;

    Stack<Character> stack = new Stack();
    for (char c : s.toCharArray()) {
      
    }
  }
}