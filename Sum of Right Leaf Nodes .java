/*This is a function problem.You only need to complete the function given below*/
/*Complete the function below
Node is as follows
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/
class GfG{
    public int rightLeafSum(Node root)
    {
      //add code here.
      //int sum=0;
      if(root==null) return 0;
      if(root.right!=null &&(root.right.left==null && root.right.right==null)){
          return rightLeafSum(root.left)+root.right.data;
      }
      else{
          return rightLeafSum(root.left)+rightLeafSum(root.right);
      
      }
   }
}
