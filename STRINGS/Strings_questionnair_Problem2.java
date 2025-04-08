//print the string in reverse order

import java.util.Scanner;
class Strings_questionnair_Problem2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to rerverse ");
		String s=sc.nextLine();

		System.out.println("the String in reverse order is: ");

		for(int x=s.length()-1;x>=0;x--)
		{
			System.out.print(s.charAt(x));
		}
	}
}