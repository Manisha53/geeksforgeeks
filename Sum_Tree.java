/*


Write a function that returns true if the given Binary Tree is SumTree else false. A SumTree is a Binary Tree where value of every node x is equal to sum of nodes present in its left subtree and right subtree of x. An empty tree is SumTree and sum of an empty tree can be considered as 0. A leaf node is also considered as SumTree.

Following is an example of SumTree.

          26
        /    \
      10      3
    /   \   /   \ 
   4     6  1    2



*/
//--------------------my code-------------------------------
class GfG
{
    public int sum(Node node){
        if(node==null) return 0;
        
        return(node.data+sum(node.left)+sum(node.right));
    }
	boolean isSumTree(Node node)
	{
             // Your code here
             if(node==null) return true;
             
             if(node.left==null && node.right==null){
                 
                 return true;
             }
             return(node.data==sum(node.left)+sum(node.right) && isSumTree(node.left) && isSumTree(node.right));
             
	}
}
