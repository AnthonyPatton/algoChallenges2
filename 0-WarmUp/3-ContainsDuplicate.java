// Given an array of integers, find if the array contains any duplicates.
// Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

// Input: [1,2,3,1] Output: true
// Input: [1,2,3,4] Output: false

class Solution {
  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i: nums) {
      if(set.contains(i)) {
        return true;
      } else {
        set.add(i);
      }
    }
    return false;
  }
}