import java.util.Scanner;
class Printing_First_letter_of_a_WORD_IN_A_STRING
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the String: ");

		String s=sc.nextLine();

		String str[]=s.split(" ");
		
		for(String t:str)
		{
			System.out.print(t.charAt(0));
		}
	}
}