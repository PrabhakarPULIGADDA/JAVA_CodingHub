//Array elemenst printing in reverse order
//26-03-2025

import java.util.Scanner;
class ArrayElementsReverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int len=sc.nextInt();

		int arr[]=new int[len];

		for(int x=0;x<=arr.length-1;x++)
		{
			arr[x]=sc.nextInt();
		}


		System.out.println("The array in reverse order is: ");

		
		for(int x=arr.length-1;x>=0;x--)
		{
			System.out.println("arr["+x+"]"+arr[x]);
		}

	}
}	