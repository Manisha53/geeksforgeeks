//O(logn)
/*This is a function problem.You only need to complete the function given below*/
class GfG
{
	int bin_search(int A[], int left, int right,  int k)
	{
		// Your code here
		int n=A.length;
		//int res=-1;
    while(left<=right){
      int mid=(left+right)/2;
      if(A[mid]==k){
          return mid;
      }
      if(A[mid]<k){
          return bin_search(A,mid+1,right,k);
      }
      else{
          return bin_search(A,left,mid-1,k);
      }
    }
    return -1;
	}
}
