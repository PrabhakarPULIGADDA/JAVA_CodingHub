import java.util.Scanner;
class Printing_Max_length_WORD_IN_A_STRING
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the String: ");
		
		String s=sc.nextLine();
		
		String str[]=s.split(" ");

		int max=0;

		for(String t:str)
		{
			if(t.length()>=max)
			{
				max=t.length();
			}
		}

		//System.out.println(max_word);

		for(String t:str)
		{
			if(t.length()==max)
			{
				System.out.print(t+" ");
			}
		}

	}
}