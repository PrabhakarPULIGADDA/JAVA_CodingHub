import java.util.Scanner;

class Strore_The_String_Reverse_Order_with_Forward_iteration
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String s=sc.next();
		
		String rev="";

		for(int x=0;x<=s.length()-1;x++)
		{
			rev=s.charAt(x)+rev;
		}
		
		System.out.println("String after Reversing: "+rev);
	}
}