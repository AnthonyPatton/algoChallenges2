Given an array of integers, find the maximum possible sum you can get from one of its contiguous subarrays.
The subarray from which this sum comes must contain at least 1 element.

For inputArray = [-2, 2, 5, -11, 6], the output should be arrayMaxConsecutiveSum2(inputArray) = 7.

The elements have to be next to each other aka contiguous.

class Solution {
  public static arrayMaxConsecutiveSum2(int[] inputArray) {
    int max_sum = inputArray[0];
    int current_sum = max_sum;
    for (int i = 1; i < inputArray.length; i++) {
      current_sum = Math.max(inputArray[i] + current_sum, inputArray[i]);
      max_sum = Math.max(cur, max_sum);
    }
    return max_sum;
  }
}