import java.util.Arrays;
import java.util.Scanner;
class Missing_Elements_in_string
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the String");
		
		String s=sc.nextLine();

		char arr[]=s.toCharArray();
		

		for(char x='a';x<='z';x++)
		{

			int count=0;

			for(char temp : arr)
			{
				if(x==temp)
				{
				count++;
				break;
				}
			}
		if(count==0)
		System.out.println(x);
		}
	}
}