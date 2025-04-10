
import java.util.Scanner;
class Unique_Char_Using_INDEXOF
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the String: ");

		String s=sc.nextLine();

		for(int x=0;x<=s.length()-1;x++)
		{
			char letter=s.charAt(x);
		
			if(s.indexOf(letter)==s.lastIndexOf(letter))
			{
				System.out.println(letter);
			}
		}
	}
}
