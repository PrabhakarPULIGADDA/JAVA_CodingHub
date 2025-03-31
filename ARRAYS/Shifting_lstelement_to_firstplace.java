class Shifting_lstelement_to_firstplace
{
	public static void main(String args[])
		{
			int arr[]=new int[]{11,22,33,44,55};

			int temp=arr[0];

	
			for(int x=0;x<arr.length-1;x++)
			{
				arr[x]=arr[x+1];	
			}
			arr[arr.length-1]=temp;
		
		System.out.println("array after Shifting_1stelement_to_Lastplace");

		for(int x=0;x<=arr.length-1;x++)
		{
			System.out.println(arr[x]);
		}


}
}	