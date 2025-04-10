//s.indexOf('a')==>first index 
//s.lastIndexOf('a')==>last index
//gives -1 if not presents

import java.util.Scanner;
class IndexOf
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the String: ");
		String str=sc.nextLine();
		
		System.out.println("enter the character: ");
		
		char ch=sc.next().charAt(0);

		System.out.println(str.indexOf(ch)+"First index");
		
		System.out.println(str.lastIndexOf(ch)+"Last index");
	}
}
	