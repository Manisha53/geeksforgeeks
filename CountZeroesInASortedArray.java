
import java.util.*;
class Count_0_In_Sorted_Matrix
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new GfG().countZeros(arr, n));
		t--;
		}
	}
}

/*This is a function problem.You only need to complete the function given below*/

//-----------------------------my code------------------------------------------

class GfG
{
    /*you are required to complete this method*/
    int countZeros(int A[][], int n)
    {
        // Your code here
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(A[i][j]==0){
                    c++;
                }
            }
        }
        return c;
    }
}
