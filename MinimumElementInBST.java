/*This is a function problem.You only need to complete the function given below*/
/* A binary search tree node class
class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
}
*/
// your task is to complete the below function
class BST
{
    int minValue(Node node)
    {
        if(node == null) return 0;
        while(node.left !=null){
            node=node.left;
        }
        return node.data;
        
    }
}
