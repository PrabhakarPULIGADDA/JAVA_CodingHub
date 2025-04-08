
import java.util.Scanner;
import java.util.Arrays;
class ANAGRAM
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);	
	
		System.out.println("Enter the first String");
		String s1=s.next();
		System.out.println("enter the next String");
		String s2=s.next();

		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();

			Arrays.sort(c1);
			System.out.println(Arrays.toString(c1));
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c2));

		if(Arrays.equals(c1,c2))
			System.out.println("ANAGRAM");

		else
			System.out.println("Not ANAGRAM");
	

	}
}