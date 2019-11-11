/*
Your Task:
This is a function problem. you don't have to read any input. Your task is to complete the function search()
which returns true if the node with value x is present in the BST else returns false.
*/
class BST
{
    boolean search(Node root, int x)
    {
	    // Your code here
	    if(root==null) return false;
	    if(x==root.data) return true;
	    if(x<root.data) return search(root.left,x);
	    if(x>root.data) return search(root.right,x);
	    return false;
    }
}
