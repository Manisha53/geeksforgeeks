//---------------------------------my code-----------------------------

class GfG
{
/*method prints the given pattern in a single line */
	void printPattern(String s)
	{
	    //Your code here
	    int l=s.length();
	    int mid=l/2;
	    String ans="";
	    String last="";
	   for(int i=mid;i<l-1;i++){
	       
	       int j=mid-1;
	       while(j++<i){
	           
	           System.out.print("   ");
	           ans=s.substring(mid,j+1);
	         }
	       System.out.print(ans+"$");
	       last=ans;
	       System.out.print("   ");
	   }
	   
	   last=last+s.charAt(l-1);
	   System.out.print(last+"$");
	  
	   for(int i=0;i<mid;i++){
	       ans=last+s.charAt(i);
	       System.out.print(ans+"$");
	       last=ans;
	       //System.out.print("    ");
	   }
	   //System.out.println();
	    
    }
}
