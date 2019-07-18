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
     
        if(Collections.frequency(clist,c)>0)
        System.out.println(Collections.frequency(clist,c));
        else
        System.out.println("Not Present");
        
    }
}
