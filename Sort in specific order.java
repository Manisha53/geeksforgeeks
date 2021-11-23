/*
Given an array A of positive integers. Your task is to sort them in such a way that the first part of the array contains odd numbers sorted in descending order, rest portion contains even numbers sorted in ascending order.

 

Example 1:

Input:
N = 7
Arr = {1, 2, 3, 5, 4, 7, 10}
Output:
7 5 3 1 2 4 10
Explanation:
Array elements 7 5 3 1 are odd
and sorted in descending order,
whereas 2 4 10 are even numbers
and sorted in ascending order.
 

Example 2:

Input:
N = 7
Arr = {0, 4, 5, 3, 7, 2, 1}
Output:
7 5 3 1 0 2 4
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function leftIndex() which takes the array Arr[] and its size N as inputs and modifies the array Arr[].


Expected Time Complexity: O(N. Log(N))
Expected Auxiliary Space: O(N)

 

Constraints:
1 <= N <= 106
0 <= Ai <= 1018


*/


class Solution
{
    
    public void sortIt(long arr[], long n)
    {
        //code here.
        int co=0;
        int ce=0;
        
        for(int i=0;i<n;i++){
             if(arr[i]%2 == 0 ){
                 ce++;
             }else{
                 co++;
             }
        }
        
        ArrayList<Long> odd=new ArrayList<Long>(co);
        ArrayList<Long> even=new ArrayList<Long>(ce);
        
        
        for(long i:arr){
            if(i%2==0) even.add(i);
            else odd.add(i);
        }
        
        Collections.sort(odd, Collections.reverseOrder());   // heart of the solution
        Collections.sort(even);
       
        
        int j=co;
        for(int i=0;i<co;i++){
            arr[i]=odd.get(i);
        }
        for(int i=0;i<ce;i++){
            arr[j++]=even.get(i);
        }
        
    }
}
/*

Total Time Taken:
2.3/7.6

*/
