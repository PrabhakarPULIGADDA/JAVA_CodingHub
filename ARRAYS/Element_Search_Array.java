//Find the specific element in an array

import java.util.Scanner;
class Element_Search_Array
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the length of a array: ");
		int length=sc.nextInt();

		int arr[]=new int[length];

		System.out.println("Enter the array elements: ");

		for(int x=0;x<arr.length;x++)
		{
			arr[x]=sc.nextInt();
		}
		
		
		System.out.println("Enter the element you want to search: ");
		int SearchElement=sc.nextInt();
		

		boolean found=false;

		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]==SearchElement)
			{
				System.out.println("Element found at index: "+x);
				found=true;
				
			}
		}
		if(found==false)
			{
				System.out.println("Element not found");
			}
			
	}
}

