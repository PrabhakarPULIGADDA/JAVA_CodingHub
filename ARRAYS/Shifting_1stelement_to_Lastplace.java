class Shifting_1stelement_to_Lastplace
{
	public static void main(String args[])
		{
			int arr[]=new int[]{10,20,30,40,50};
			int temp=arr[arr.length-1];

	
			for(int x=arr.length-1;x>0;x--)
			{
				arr[x]=arr[x-1];	
			}
			arr[0]=temp;
		
		System.out.println("array after Shifting_1stelement_to_Lastplace");

		for(int x=0;x<=arr.length-1;x++)
		{
			System.out.println(arr[x]);
		}


}
}	