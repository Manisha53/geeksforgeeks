/*-----------------------------------------
An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, find the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. 


Example 1:

Input:
N = 3
arr[] = {1,2,3}
Output: 1
Explanation: index 2 is 3.
It is the peak element as it is 
greater than its neighbour 2.
Example 2:

Input:
N = 2
arr[] = {3,4}
Output: 1
Explanation: 4 (at index 1) is the 
peak element as it is greater than 
its only neighbour element 3.
 

Your Task:
You don't have to read input or print anything. Complete the function peakElement() which takes the array arr[] and its size N as input parameters and return the index of any one of its peak elements.

Can you solve the problem in expected time complexity?

 

Expected Time Complexity: O(log N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 105
1 ≤ A[] ≤ 106


---------------------------------------*/

	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int res=0;
       
       if(n==1){
          res=0; 
       } 
       else{
           if(arr[0]>=arr[1] ){ //first element is peak element
                   res=0;    
               }
           else if(arr[n-1]>=arr[n-2]){  // last one is peak
               res=n-1;
           }
        else{   
           for(int i=1;i<n-1;i++){      
               int j=i-1;
               int k=i+1;
               
               if(arr[i]>=arr[j] && arr[i]>=arr[k]){  // second element to second last element
                   res=i;
               }
           }
       }
    }    
    return res;
}
    
}

/*----------------------
Total Time Taken:
1.5/3.9
*/
