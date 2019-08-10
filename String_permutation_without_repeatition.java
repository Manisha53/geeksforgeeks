
import java.util.*;
public class Main
{
    
    static void print(String s,String r){
        boolean ar[]=new boolean[26];       //initialised to 0
        if(s.length()==0){
            System.out.println(r+" ");
            return;
        }
        for(int i=0;i<s.length();i++){
		    char arr=s.charAt(i);
		    String ros=s.substring(0,i)+s.substring(i+1);
		    if(ar[arr-'a']==false){
		         print(ros,r+arr);
		    }
		    ar[arr-'a']=true;
		   
		}
    }
    
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=in.nextLine();
		
		print(s," ");
	}
}
