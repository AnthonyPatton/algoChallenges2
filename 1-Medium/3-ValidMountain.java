// Given an array A of integers, return true if and only if it is a valid mountain array.

// Recall that A is a mountain array if and only if:

// A.length >= 3
// There exists some i with 0 < i < A.length-1 such that: 
//   A[0] < A[1] < ... A[i-1] < A[i]
//   A[i] > A[i+1] > ... > A[A.length - 1]

// Input: [2,1] Output: false
// Input: [0,3,2,1] Output: true

class Solution {
  public boolean validMountainArray(int[] A) {
    int i = 0;
    while (i < A.length && i + 1 < A.length && A[i] < A[i + 1]) {
      i++;
    }

    if (i == 0 || i + 1 >= A.length) {
      return false;
    }

    while (i < A.length && i + 1 < A.length) {
      if (A[i] <= A[i++ + 1]) {
        return false;
      }
    }

    return true;
  }
}


