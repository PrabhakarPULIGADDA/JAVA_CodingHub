import java.util.Arrays;
import java.util.Scanner;
class Second_Max_in_a_String
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the String");
		
		String s=sc.nextLine();

		char arr[]=s.toCharArray();
		char b[]=new char[arr.length];

		int max=0,second_max=0;

		
		for(int x=0;x<=arr.length-1;x++)
		{
			int count=1;
			if(b[x]==1)
			continue;

			for(int y=x+1;y<=arr.length-1;y++)
			{
				if(arr[x]==arr[y])
				{
					b[y]=1;
					count++;
				}
			}

			if(arr[x]>max)
			{
			second_max=max;
			max=arr[x];
			}

			else if(arr[x]>second_max&&arr[x]<max)
			{
				second_max=arr[x];
			}
		}

		System.out.println("Secondmaximum element is: "+(char)second_max);		

	}
}