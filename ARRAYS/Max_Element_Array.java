//Find the MaxElement in the array


import java.util.Scanner;
class Max_Element_Array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of a array: ");
		int length=sc.nextInt();

		int arr[]=new int[length];

		System.out.println("Enter the array elements: ");
		int Max=0;
		
		for(int x=0;x<arr.length;x++)
		{

			arr[x]=sc.nextInt();
			if(arr[x]>Max)
			{
				Max=arr[x];
			}
		}

		System.out.println("the Maximum digit is: "+Max);
	}
}