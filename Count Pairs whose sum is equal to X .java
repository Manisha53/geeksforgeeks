/*
Given two linked list of size N1 and N2 respectively of distinct elements, your task is to complete the function countPairs(), which returns the count of all pairs from both lists whose sum is equal to the given value X.
Note: The 2 numbers of a pair should be parts of different lists.

Example 1:

Input:
L1 = 1->2->3->4->5->6
L2 = 11->12->13
X = 15
Output: 3
Explanation: There are 3 pairs that
add up to 15 : (4,11) , (3,12) and (2,13)
Example 2:

Input:
L1 = 7->5->1->3
L2 = 3->5->2->8
X = 10
Output: 2
Explanation: There are 2 pairs that add up
to 10 : (7,3) and (5,5)
Your Task:
You only need to implement the given function countPairs() and return the count.

Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(N+M)

Constraints:
1<=size of linked list<=10000
1<=X<=10000

Note : All elements in a linked list are unique.
*/
// your task is to complete this function

/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/
//--------------------------------------------O(m*n)------naive approach-----------------------------------
class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
                              
        // add your code here
        int count=0;
        for(Integer i:head1){
            for(Integer j:head2){
                if(i+j==x) count++;
            }
        }
        
        return count;
    }
}
//-------------------------------------O(m)+O(n)---------best approach---------------------------------------

/ your task is to complete this function

/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
                              
        int count = 0;
          
        HashSet<Integer> unorderedSet = new HashSet<Integer>();
          
        Iterator<Integer> itr1 = head1.iterator();
        while (itr1.hasNext()){
            unorderedSet.add(itr1.next());   //add all items from first ll
        }
        
        Iterator<Integer> itr2 = head2.iterator();
        while (itr2.hasNext()){
            if (!(unorderedSet.add(x - itr2.next())))//since set contains unique elements so "!"" is used
                count++;
        }
        
        return count;
    }
}
