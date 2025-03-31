
import java.util.Scanner;
class Liner_search
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		
		int arr[]=new int[5];
		
		System.out.println("enter the elements for the array: ");
		
		for(int x=0;x<arr.length;x++)
		{
			arr[x]=sc.nextInt();
		}

		System.out.println("enter the element you want to search: ");
		
		int count=0;
		int search_element=sc.nextInt();

		for(int x=0;x<arr.length;x++)
		{
		
			if(arr[x]==search_element)
			{
				System.out.println("Element found at "+x+" index");
				count++;
				//break;//(if an array having multiple search elements then break not use...else you want to search only one element then use break)
			}	
		}
		if(count==0)
		System.out.println("element not found");
	}
}			














