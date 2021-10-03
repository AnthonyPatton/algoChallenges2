// A peak element is an element that is greater than its neighbors.

// Given an input array nums, where nums[i] does not equal nums[i+1], find a peak element and return its index.

// THe array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

// You may imagine that nums[-1] = nums[n] = -infinity.

// Input: nums = [1,2,3,1] Output: 2 
// Explanation: 3 is a peak element and your function should return the index number 2. 


class Solution {
  public int findPeakElement(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] < mid[mid + 1]) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    return left; 
  }
}