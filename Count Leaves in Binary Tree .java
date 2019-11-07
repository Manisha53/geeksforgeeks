/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class GfG
{
    int countLeaves(Node node) 
    {
         // Your code  
         int c=0;
         if(node==null) return 0;
         if(node.left==null && node.right==null){
             c++;
         }
         else{
             return(countLeaves(node.left)+countLeaves(node.right));
         }
         return c;
    }
}
