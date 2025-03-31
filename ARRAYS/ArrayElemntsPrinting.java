//Array elemenst printing
//26-03-2025

import java.util.Scanner;
class ArrayElemntsPrinting
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length: ");
		int len=sc.nextInt();
		
		int array[]=new int[len];

		System.out.println("Enter the array Elements: ");

		
		for (int x=0;x<=array.length-1;x++)
		{
			array[x]=sc.nextInt();
		}

		
		System.out.println("The array elements are: ");
		

		for(int x=0;x<=array.length-1;x++)
		{
			System.out.println("arr["+x+"]="+array[x]);    //arr[x]=> array elements will be printed and x is prints index
		}

	}
}



		