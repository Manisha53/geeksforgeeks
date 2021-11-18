/*
Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome
 

Your Task:  
You don't need to read input or print anything. Complete the function isPlaindrome() which accepts string S and returns a boolean value


Expected Time Complexity: O(Length of S) 
Expected Auxiliary Space: O(1) 


Constraints:
1 <= Length of S <= 105


*/

class Solution {
    int isPalindrome(String S) {
        // code here
        int res=0;
     
        List<Character> l=new ArrayList<>();     // for converting string S to List of characters so that .reverse() could be applied
        List<Character> m=new ArrayList<>();
        
        for(char c:S.toCharArray()){
            l.add(c);                          //to be reversed 
            m.add(c);                          // original
        }
        
        Collections.reverse(l);               
        
        if(l.equals(m)) res=1;               // if reversed and original strings are equal then Palindrome
        

        return res;
    }
};
