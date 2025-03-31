//Array elemenst sum
//26-03-2025


import java.util.Scanner;

class ArrayElements_Sum
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the length of array: ");
		int len=sc.nextInt();
	
		int arr[]=new int[len];
		int sum=0;

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
	System.out.println("Sum of array elements are: "+sum);
	
	}

}