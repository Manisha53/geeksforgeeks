import java.util.Scanner;
import java.util.*;
import java.util.HashSet;
class Delete_Duplicate
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int N = sc.nextInt();
			int a[] = new int[N];
			for(int i=0; i<N; i++)
				a[i] = sc.nextInt();
			
			GfG g = new GfG();
			int n = g.remove_duplicate(a);
			
			for(int i=0; i<n; i++)
			System.out.print(a[i]+" ");
			
			System.out.println();
			
		T--;
		}
	}
}


//-------------------------------my code-----------------------------
/*This is a function problem.You only need to complete the function given below*/
class GfG
{
        /*You are required to complete this function */
	int remove_duplicate(int a[])
	{
		// Your code here
		int i = 0, j = 1;
    while(j < a.length) {
        if(a[i] != a[j]) {
            i++;
            a[i] = a[j];
         }
         j++;
        }
        return i+1;
	}
}
