//Binary search for Descending elements

import java.util.Scanner;
/*
class BINARY_SEARCH_DESCENEDING_ELEMENTS
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);

		int arr[]=new int[]{12,345,21,34,456,734,23,90,46};


		System.out.println("Array before sorting: ");
		for(int x=0;x<=arr.length-1;x++)
		{
			System.out.print(arr[x]+" ");
		}

		System.out.println("\n\nARRAY AFTER DESCENDING ORDER SORTING");
		
		
		for(int x=0;x<=arr.length-2;x++)
		{
			for(int i=x+1;i<=arr.length-1;i++)
			{
				if(arr[x]<arr[i])
				{
					int temp=arr[x];
					arr[x]=arr[i];
					arr[i]=temp;
				}
				
			}
		}


		for(int x=0;x<=arr.length-1;x++)
		{
			System.out.print(arr[x]+" ");
		}

	
		int start=0,end=arr.length-1,mid=0;

		System.out.println("\n\nEnter the element you want to search: ");
		int search=sc.nextInt();

		while(start<=end)
		{
			mid=(start+end)/2;

			
			if(search==arr[mid])
			{
			System.out.println("\nElement found at: "+mid);
			break;
			}


			else if(search>arr[mid])
			end=mid-1;
	
			else
			start=mid+1;

	
		}

		if(start>end)
		System.out.println("element not found");
	}
}
		
*/




class BINARY_SEARCH_DESCENEDING_ELEMENTS
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);

		int arr[]=new int[]{12,345,21,34,456,734,23,90,46};


		System.out.println("Array before sorting: ");
		for(int x=0;x<=arr.length-1;x++)
		{
			System.out.print(arr[x]+" ");
		}
		
		Binary_Search bs=new Binary_Search();
		int a[]=bs.Sorting(arr);
		

		System.out.println("array after Descending order sorting");
		for(int x=0;x<=a.length-1;x++)
		{
			System.out.print(a[x]+" ");
		}

		System.out.println("Enter thr element you want to search: ");
		int Search=sc.nextInt();

		System.out.println(bs.Sorting(a,Search));
	}
}

		





class Binary_Search
{
	int [] Sorting(int arr[])
	{
		for(int x=0; x<=arr.length-2;x++)
		{
			for(int y=x+1;y<=arr.length-1;y++)
			{
				if(arr[x]<arr[y])
				{
					int temp=arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
			}
		}

		return arr;
	}



	
	String Sorting(int arr[],int search)
		{
			int start=0,end=arr.length-1,mid=0;
			
			while(start<=end)
			{
				mid=(start+end)/2;

				if(search==arr[mid])
				{
					return "Element found at: "+mid;
					//break;
				}

				else if(search>arr[mid])
				end=mid-1;

				else
				start=mid+1;

				
			}
			if(start<end)
				return "element not found";
			else
				return "element found at: "+mid;
		}
}

			












		

		