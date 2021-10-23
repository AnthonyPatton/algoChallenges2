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
  if (suffix.length == 0) {
    results.add(prefix);
  } else {
    for (int i = 0; i < suffix.length(); i++) {
      permutations(prefix + suffix.charAt(i), suffix.substring(0, i) 
        + suffix.substring(i+1, suffix.length()));
    }
  }
}