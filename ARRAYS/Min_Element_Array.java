//Print the minimum digit in the array

import java.util.Scanner;
class Min_Element_Array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of a array: ");
		int length=sc.nextInt();

		int arr[]=new int[length];

		System.out.println("Enter the array elements: ");
		int Min=9;
		
		for(int x=0;x<arr.length;x++)
		{

			arr[x]=sc.nextInt();
			if(arr[x]<Min)
			{
				Min=arr[x];
			}
		}

		System.out.println("the Minimum digit is: "+Min);
	}
}