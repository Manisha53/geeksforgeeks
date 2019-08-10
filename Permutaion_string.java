
import java.util.*;
public class Main
{
    
    static void print(String s,String r){
        if(s.length()==0){
            System.out.println(r+" ");
            return;
        }
        for(int i=0;i<s.length();i++){
		    char a=s.charAt(i);
		    String ros=s.substring(0,i)+s.substring(i+1);
		    print(ros,r+a);
		}
    }
    
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=in.nextLine();
		
		print(s," ");
	}
}
