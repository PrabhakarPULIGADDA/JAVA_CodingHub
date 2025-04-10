//STRING CONTAINS ALL THE ALPHABETS:"a quick brown fox jumps over the lazy dog"

import java.util.Scanner;
class PANAGRAM_Or_missing_elements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the String you want to check: ");
		
		String s=sc.nextLine();

		
		System.out.println("Missing capitals are: ");


		for(char x='A';x<='Z';x++)
		{
			int count1=0;

			for(int y=0;y<=s.length()-1;y++)
			{
				char letter=s.charAt(y);
				
				if(x==letter)
				{
					count1++;
				}
			}
			if(count1==0)
			System.out.print(x+" ");

		}


		System.out.println("\n Missing smallcase letters are: ");

		for(char x='a';x<='z';x++)
		{
			int count2=0;
			for(int y=0;y<=s.length()-1;y++)
			{
				char letter=s.charAt(y);
				
				if(x==letter)
				{
					count2++;
				}

			}

			if(count2==0)
			System.out.print(x+" ");	
		}
	}
}