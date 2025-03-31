//Average of array elemenst

import java.util.Scanner;
import java.util.Random;

class Average_of_Array_Elements
{
	public static void main(String args[])
	{
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length: ");
		int length=sc.nextInt();

		int arr[]=new int[length];

		int sum=0;

		for(int x=0;x<=arr.length-1;x++)
		{
			arr[x]=r.nextInt(1,20);
			sum+=arr[x];
		}
		
		System.out.println("sum of elements is: "+sum);

		System.out.println("average of numbers is: "+(sum/length));


		
	}
}

		