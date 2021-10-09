// Given an array of strings, group anagrams together.

// Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Output: 
// [
//   ["ate", "eat", "tea"],
//   ["nat", "tan"],
//   ["bat"]
// ]
// All inputs will be in lowercase.
// The order of your output does not matter.

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {

   List<List<String>> result = new ArrayList<>();
   Map<String, List<String>> map = new HashMap<>();

   for (String str: strs) {
     char [] tempArray = str.toCharArray();
     Arrays.sort(tempArray);
     String sortedString = new String(tempArray);

     if (map.containsKey(sortedString)) {
       map.get(sortedString).add(str);
     } else {
       List<String> tempList = new ArrayList<>();
       tempList.add(str);
       map.put(sortedString, tempList);
     }
   }
   for(Map.Entry<String, List<String>> entry : map.entrySet()) {
     result.add(entry.getValue());
   }
   return result;
  }
}