import java.util.Scanner;
class ACCESSING_WORDS_IN_A_STRING
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the String: ");

		String s=sc.nextLine();
		
		String str[]=s.split(" ");

		for(String t:str)
		{
			System.out.println(t);
		}
	}
}