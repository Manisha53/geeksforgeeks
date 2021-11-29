/*
Given a singly linked list and a key, count the number of occurrences of given key in the linked list.

Example 1:

Input:
N = 7
Link List = 1->2->1->2->1->3->1
search_for = 1
Output: 4
Explanation:1 appears 4 times.
Example 2:

Input:
N = 5
Link List = 1->2->1->2->1
search_for = 3
Output: 0
Explanation:3 appears 0 times.
Your Task:
You dont need to read input or print anything. Complete the function count() which takes the head of the link list and search_for i.e- the key as input parameters and returns the count of occurrences of the given key.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
0 ≤ N ≤ 10^4

*/

/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class Solution
{
    public static int count(Node head, int search_for)
    {
        //code here
        int count=0;
    
        Node trv=head;
        while(trv!=null){
            if(trv.data==search_for) count++;
            
            trv=trv.next;
        }
        return count;
    }
}
