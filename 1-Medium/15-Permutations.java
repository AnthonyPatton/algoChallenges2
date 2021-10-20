// Write a function that returns all permutations of a given list.

// eg. 

// permutations({1, 2, 3})
// {1, 2, 3}
// {1, 3, 2}
// {2, 1, 3}
// {2, 3, 1}
// {3, 1, 2}
// {3, 2, 1}


public ArrayList<String> permutations(String s) {
  ArrayList<String> results = new ArrayList<String>();
  permutation("", s, results);
  return results;
}

private void permutations(String prefix, String suffix, ArrayList<String> results) {
  
}