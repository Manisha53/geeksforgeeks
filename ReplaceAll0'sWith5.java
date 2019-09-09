{
import java.util.Scanner;
import java.lang.Math;
class Convert_To_Five
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int N = sc.nextInt();
			System.out.println(new GfG().convertfive(N));
			T--;
		}
		
	}
}
}
/*This is a function problem.You only need to complete the function given below

*/
//-----------------------------my code------------------------
class GfG
{
    int convertfive(int num)
    {
        return (Integer.parseInt( new Integer(num).toString().replaceAll("0", "5") ));
    }
}
