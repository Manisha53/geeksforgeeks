/*This is a function problem.You only need to complete the function given below*/
/*class Node of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class GfG
{
    
    public static boolean printAncestors(Node node, int x)
    {
        // add your code here
        
        if(node==null) return false;
        if(x==node.data) return true;
        if(printAncestors(node.left,x) || printAncestors(node.right,x)){
            System.out.print(node.data+" ");
            return true;
        }
        return false;
        
    }
}
