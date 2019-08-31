{
//Initial Template for Java
import java.util.*;
//Position this line where user code will be pasted.
// Driver class with driver code
class GFG 
{
	// Driver code
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		    // Declaring ArrayList 
		    ArrayList<Character> clist = new ArrayList<Character>();
		    
		    int q = sc.nextInt();
		    
		    // Looping for queries
		    while(q-- > 0)
		    {
		       char ch = sc.next().charAt(0);
		       Geeks obj = new Geeks();
		       
		       if(ch == 'i')
		       {
    		       char c = sc.next().charAt(0);
    		       obj.insert(clist, c);
		       }
		    
		       if(ch == 'f')
		       {
    		        char c = sc.next().charAt(0);
    		        obj.freq(clist, c);
		       }
		    }
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
// Geeks clas with functions insert and freq
// insert : to insert element into ArrayList
// freq : function to count frequency of element
class Geeks
{
    // Function to insert element
    public static void insert(ArrayList<Character> clist, char c)
    {
        
        //add c to clist
        clist.add(c);
    }
    
    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c)
    {
     
        if(clist.contains(c))
        System.out.println(Collections.frequency(clist,new Character(c)));
        else
        System.out.println("Not Present");
        
    }
}
