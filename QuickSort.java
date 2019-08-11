
class QuickSort
{
    /* This function takes last element as pivot, places  the pivot element 
    at its correct position in sorted  array, and places all smaller (smaller
    than pivot) to left of pivot and all greater elements to right  of pivot */
    static int partition(int arr[], int low, int high)
    {
        // add your code here
        int p=arr[high];      //pivot is last element
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=p){
                i+=1;
                int t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
            }
            
        }
        int t=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=t;
        
       return i+1; 
    } 
}
