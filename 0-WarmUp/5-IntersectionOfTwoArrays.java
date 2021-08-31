/* Given two arrays, write a function to compute their intersection
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
*/

class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i: nums1) {
      set.add(i);
    }
    HashSet<Integer> intersection = new HashSet<Integer>();
    for(int i: nums2) {
      if(set.contains(i)) {
        intersection.add(i);
      }
    }
    int[] result = new int[intersection.size()];
    int index = 0;
    for(int i: intersection) {
      result[index++] = i;
    }
    return result;
  }
}