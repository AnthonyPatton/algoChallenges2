// Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image. 

// To flip an image horizontally means that each row of the image is reversed. For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For ex, inverting [0, 1, 1] results in [1, 0, 0].

class Solution {
  public int[][] flipAndInvertImage(int[][] A) {
    for (int i = 0; i < A.length; i++) {
      int j = 0;
      int k = A[i].length - 1;
      while(j < k) {
        int temp = A[i][j];
        A[i][j++]
      }
    }
  }
}

