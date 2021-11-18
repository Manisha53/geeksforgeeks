/*
Given a string without spaces, the task is to remove duplicates from it.

Note: The original order of characters must be kept the same. 

Example 1:

Input: S = "zvvo"
Output: "zvo"
Explanation: Only keep the first
occurrence

*/

class Solution {
    String removeDups(String S) {
        String res="";
         Set<Character> hash_Set = new HashSet<Character>();  // to remove duplicacy
         for(int i=0;i<S.length();i++){
            if(hash_Set.add(S.charAt(i))==true){            // This condition will only be true when no duplicate elements will come
                res+=Character.toString(S.charAt(i));       // appending non-duplicate characters to the resultant string 
            }
        }
        return (res);
    }
}
