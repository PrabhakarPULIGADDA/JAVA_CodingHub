
 /* class BINARY_SEARCH
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,3,15,27,39,43,49,78,89,93};

		int first=0,last=arr.length-1,mid=0,search=4;

		while(first<=last)
		{
			mid=(first+last)/2;
			
			if(search==arr[mid])
			{
				System.out.println("Element found"+mid);
				break;
			}

			else if(search>arr[mid])
			{
				first=mid+1;
			}
				
			else
			{
				last=mid-1;
			}
		}


		if(first>last)
		System.out.println("ELEMNET NOT FOUND");
	
	}
}

*/


class BINARY_SEARCH
{
	public static void main(String args[])
		{
			Bsearch bs=new Bsearch();
			
			int arr[]=new int[]{12,34,56,78,90,123,345,789};

			System.out.println(bs.Searching(arr,0,arr.length-1,0,123));

		}
}


class Bsearch
{
	String Searching(int arr[],int first,int last,int mid,int search)
	{	
		
		while(first<=last)
		{
			mid=(first+last)/2;

			if(search==arr[mid])
			{
				return "Element Found  at: "+mid;
			}
		
		
			else if(search>arr[mid])
			{
				first=mid+1;
			}

			else
			{
				last=mid-1;
			}
		}

		if(first>last)
		
		    return "element not found";	
                else
                   return "element found";
	}
}


















