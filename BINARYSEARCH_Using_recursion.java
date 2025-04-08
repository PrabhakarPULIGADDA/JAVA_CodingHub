class BINARYSEARCH_Using_recursion
{
	int[] Single_Loop_Sorting(int a[],int x)
	{
		if(x>=a.length-1)
		{
			return a;
		}

		else
		{
			if(a[x]>a[x+1])
			{
				int temp=a[x];
				a[x]=a[x+1];
				a[x+1]=temp;
				x=-1;
			}
			
		return Single_Loop_Sorting(a,x+1);
		
	
		}	
	}

	
	void Binary_Search(int a[],int search,int start,int end,int mid)
	{
		if(start>end)
		{
			System.out.println("element not found");	
		}

		else
		{
		 	mid=(start+end)/2;

		if(a[mid]==search)
		{
			System.out.println("Element foud at: "+mid);
		}

		else if(search>a[mid])
		{
			Binary_Search(a,search,mid+1,end,mid);
		}

		else
		{
		        end=mid-1;
		}
		}
	}
	


       public static void main(String args[])
	{
			
		BINARYSEARCH_Using_recursion br= new BINARYSEARCH_Using_recursion();

		int a[]=new int[]{5,2,1,3,4};

		int b[]=br.Single_Loop_Sorting(a,1);
	
		System.out.println("Array after Sorting: ");
		for( int t:b)
		{
			System.out.println(t);	
		}

		br.Binary_Search(b,4,0,b.length-1,0);
		
	}

}	