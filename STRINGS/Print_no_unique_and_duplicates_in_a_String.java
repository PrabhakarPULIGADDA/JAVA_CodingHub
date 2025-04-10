import java.util.Arrays;
import java.util.Scanner;
class Print_no_unique_and_duplicates_in_a_String
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the String");
		
		String s=sc.nextLine();

		char arr[]=s.toCharArray();
		char b[]=new char[arr.length];

		int max=0;
		char element=0;

		//System.out.println("Unique elements are: ");

		//System.out.println("Duplicate elements are: ");

		System.out.println("frequency is: ");
		
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

		if(count>max)
		{
		max=count;
		element=arr[x];
		}

		/*if(count==1)
		System.out.println(arr[x]);*/

		/*if(count>1)
		System.out.println(arr[x]);*/
		
		System.out.println(arr[x]+" is repeated about "+count+"times");
		}
		
		System.out.println("Max repeated element is: "+element+" No of times is:"+max);
	}
}
			