//print the highest element in the 1st index


class Higest_element_to_First_index
{
	public static void main(String args[])
	{
		int arr[]=new int[]{-8,-2,-3,-4,-55,-6,-7,-1};
		int Max=0,Min=9;
		int position1=0,position2=0;

		
		for(int x=0;x<arr.length;x++)
			{
				if(arr[x]>Max)
				{
					Max=arr[x];
					position1=x;
				}

				if(arr[x]<Min)
				{
					Min=arr[x];
					position2=x;
				}
			
			}
		System.out.println("Highest element is: "+Max+ " its position is: "+position1);

                System.out.println("lowest element is: "+Min+ " its position is: "+position2);


	
			int temp1=arr[0];
			int temp2=arr[arr.length-1];

			arr[0]=arr[position1];
			arr[arr.length-1]=arr[position2];


			arr[position1]=temp1;
			arr[position2]=temp2;

			

			

                for(int x=0;x<arr.length;x++)
		{
			System.out.println(arr[x]);

		} 
		
	}
}



				