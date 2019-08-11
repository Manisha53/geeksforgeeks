SOLUTION 1:O(n2)
// C program for insertion sort
#include <stdio.h>
#include <math.h>
void insert(int arr[], int i);
/* Function to sort an array using insertion sort*/
void insertionSort(int arr[], int n)
{
   int i;
   for (i = 1; i < n; i++)
      insert(arr, i);
}
/* Function to print an array */
void printArray(int arr[], int size)
{
    int i;
    for (i=0; i < size; i++)
        printf("%d ", arr[i]);
    printf("
");
}
// Driver program to test above functions
int main()
{
    int arr[1000],n,T,i;
    scanf("%d",&T);
    while(T--){
    scanf("%d",&n);
    for(i=0;i<n;i++)
      scanf("%d",&arr[i]);
    insertionSort(arr, n);
    printArray(arr, n);
    }
    return 0;
}

}
/*This is a function problem.You only need to complete the function given below*/
/* The task is to complete insert() which is used 
   as shown below to implement insertionSort() */
/* Function to sort an array using insertion sort
void insertionSort(int arr[], int n)
{
   int i;
   for (i = 1; i < n; i++)
      insert(arr, i);
} */
void insert(int arr[], int n)
{
    // Your code here  
    for(int i=0;i<=n;i++){
        for(int j=0;j<=i;j++){
            if(arr[j]>arr[i]){
                int t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
            }
        }
    }
}



SOLUTION 2:optimised

import java.util.*;
import java.lang.Math;
class Sorting
{
	static void insertionSort(int arr[],int n)
		{
			int i;
			for(i=1;i<n;i++)
			new InsertionSort().insert(arr,i);
		}
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			 insertionSort(a,n);
			 printArray(a,n);
			
		t--;
		}
		
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
/* The task is to complete insert() which is used 
   as shown below to implement insertionSort() */
/* Function to sort an array using insertion sort
static void insertionSort(int arr[], int n)
{
  GfG obj = new GfG();
   for (int i = 1; i < n; i++)
      obj.insert(arr, i);
} */
class InsertionSort
{
  static void insert(int arr[],int length)
  {
       // Your code here
       int i, j, key;
	for (i = 1; i < length+1; i++) 
	{
		j = i;
 		while (j > 0 && arr[j - 1] > arr[j]) 
 		{
 			key = arr[j];
 			arr[j] = arr[j - 1];
 			arr[j - 1] = key;
 			j--;
 		}
	}
  }
}


