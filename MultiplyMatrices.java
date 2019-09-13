//---------------my code----------------
class GfG
{
      public static void multiply(int A[][], int B[][], int C[][], int N)
        {
           //add code here.
           //int[] res=new int[N];
           for(int i=0;i<N;i++){
               for(int j=0;j<N;j++){
                   int val=0;
                   for(int k=0;k<N;k++){
                       val+=A[i][k]*B[k][j];
                   }
                   C[i][j]=val;
                   //System.out.print(C[i][j]+" ");
               }
           }
           
        
        }
}
