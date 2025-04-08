//1.write a java Program to find the length of a string

import java.util.Scanner;
class Strings_questionnair_Problem1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to find length");
		String s=sc.nextLine();
		System.out.println("String length is: "+s.length());
	}
}