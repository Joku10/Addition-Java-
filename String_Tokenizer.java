
import java.util.*;
class String_Tokenizer
{
	public static void main(String[]args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers with one space gap: ");
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens())
		{
		  String temp=st.nextToken();
		  int n=Integer.parseInt(temp);
		  sum=sum+n;
		}
	 
	System.out.println(sum);
	}
}
