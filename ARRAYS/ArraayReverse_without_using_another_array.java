//reversing the array without using another array

import java.util.Scanner;
class ArraayReverse_without_using_another_array
{
	public static void main(String args[])
		{
			int arr[]=new int[5];
			
			Scanner sc=new Scanner(System.in);
	
			System.out.println("Enter the elements to array: ");
			
			int y=arr.length-1;
			for(int x=arr.length-1;x>=0;x--)
			{
				arr[x]=sc.nextInt();
			}
			for(int x=arr.length-1;x>=0;x++)
			{
			
				System.out.println(arr[x]);
			}
			

			
		}
}