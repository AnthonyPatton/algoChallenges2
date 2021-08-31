// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Ex: Input: [0, 1, 0, 3, 12]
// Output: [1, 3, 12, 0, 0]
// 1. You must do this in-place without making a copy of the array.
// 2. Minimize the total number of operations. 

class Solution {
  public void moveZeroes(int[] nums) {
    int index = 0;
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] != 0) {
        nums[index++] = nums[i];
      }
    }

    for(int i = index; i < nums.length; i++) {
      nums[i] = 0;
    }
  }
}