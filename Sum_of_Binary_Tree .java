/*This is a function problem.You only need to complete the function given below*/
/*Complete function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class GfG{
    public int sumBT(Node root){
      // add code here.
      int sum=0;
      if(root==null) return 0;
      /* optional-----
    //   else if(root.left==null && root.right == null){
    //       sum+= root.data;
    //       return sum;
    //   }
    /*
     return root.data+sumBT(root.left)+sumBT(root.right);
   }
}
