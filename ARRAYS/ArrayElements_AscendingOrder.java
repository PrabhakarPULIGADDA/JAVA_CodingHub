//Print the elements of an array in ascending order


class ArrayElements_AscendingOrder_Main
{
	public static void main(String args[])
		{
			ArrayElements_AscendingOrder as = new ArrayElements_AscendingOrder();
			int arr[]=new int[]{1,20,-3,5,7,90,8};
			
			
			int res[]=as.SortElements(arr);
			
			System.out.println("array elements after ASCENDING order: ");

			for(int x=0;x<=res.length-1;x++)
			{
				System.out.print(res[x]+" ");
			}

		
		
		//SECOND LARGEST
	
		for(int x=res.length-2;x>=0;x++)
		{
		if(res[x]!=res[res.length-1])
		{
			System.out.println("\n Second largest is: "+res[x]);
			break;
		}
		}





			
		}
}


class ArrayElements_AscendingOrder
{
	int [] SortElements(int arr[])
	{
		for(int x=0;x<=arr.length-2;x++)
			{
				for(int i=x+1;i<=arr.length-1;i++)
					{
						if(arr[x]>arr[i])
						{
							int temp=arr[x];
							arr[x]=arr[i];
							arr[i]=temp;
						}
					}
			}
		return arr;
	}


}