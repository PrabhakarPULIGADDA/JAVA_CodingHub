//using binary search search for an element in the array if the element is present delete the element else if not insert the element


import java.util.Scanner;
class Binary_Search_FULL
{
	public static void main(String args[])
	{
		
		Binary_FULL b= new Binary_FULL();
		Scanner sc=new Scanner(System.in);
	
		int arr[]=new int[5];

		System.out.println("Enter the array elements: ");
		
		for(int x=0;x<=arr.length-1;x++)
		{
			arr[x]=sc.nextInt();
		}

	
		int a[]=b.Array_Sorting_Ascending(arr);

		System.out.println("array after sorting");
		for(int tr:a)
		{
			System.out.println(tr);
		}
		
		


		System.out.println("enter the element you want to search");
		int search1=sc.nextInt();
		
		int res=b.BinarySEarch(a,search1);
		
		if(res>=0)
		{
			int brr[]=b.elementDELETING(a,res);
			
			System.out.println("Element found we have to delete so array after deleting: ");
			for(int t:brr)
			{
				System.out.println(t);
			}

		}


		else
		{
			System.out.println("Enter the index: ");
			int index=sc.nextInt();
			if(index<0 || index>a.length)
			{
				System.out.println("not able to insertr");
			}
			else
			{
			int crr[]=b.elementInsert(a,index,search1);
	
			System.out.println(" Element not found so we have to insert so array After insering element");
			
			for(int rr:crr)
			{
			System.out.println(rr);	
			}
			}
		}
		
		
	}
}


class Binary_FULL
{
	int [] Array_Sorting_Ascending(int arr[])
	{
		for(int x=0;x<=arr.length-1;x++)
		{
			for(int y=x+1;y<=arr.length-1;y++)
			{
	
				if(arr[x]>arr[y])
				{
					int temp=arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
			}
		}
		return arr;
	}

	int mid=0;	
	int BinarySEarch(int arr[],int search)
	{
		int start=0,end=arr.length-1;

		while(start<=end)
		{
			mid=(start+end)/2;

			if(search==arr[mid])
			{
				return mid;
				//break;
			}

			else if(search>arr[mid])
			start=mid+1;

			else
			end=mid-1;

		}
			if(start>end)
			return  -1;

			else
			return mid;	
	}

		int [] 	elementDELETING(int a[],int mid)
		{
	

			for(int x=mid;x<=a.length-2;x++)
			{
			a[x]=a[x+1];
			}
			a[a.length-1]=0;
			return a;
		}


		int [] elementInsert(int a[],int index,int search)
		{
			for(int x=a.length-1;x>index;x--)
			{
				a[x]=a[x-1];	
			}
		
			a[index]=search;
			return a;
		}

}






