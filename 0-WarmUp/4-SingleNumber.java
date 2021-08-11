/* Given a non-empty array of integers, every element appears twice except for one. Find the single one.  

Input: [4,1,2,1,2]
Output: 4

 */

class Solution {
  public int singleNumber(int[] nums) {
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i: nums) {
      if(set.contains(i)) {
        set.remove(i);
      } else {
        set.add(i);
      }
    }

    for(int i: set) {
      return i;
    }

    return -1;
  }
}