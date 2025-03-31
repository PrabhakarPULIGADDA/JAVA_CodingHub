//given an array print the even elements in that
//26-03-2025

import java.util.Scanner;

class Even_elements_Array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the array size: ");
		int l=sc.nextInt();
		
		int arr[]=new int[l];

		System.out.println("Enter the elements to check even or not: ");
		
		for(int x=0;x<arr.length;x++)
		{

			arr[x]=sc.nextInt();

		}

		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]%2==0)
			{
				System.out.println("arr["+x+"]="+arr[x]+" is even");
			}
		}
	}
}