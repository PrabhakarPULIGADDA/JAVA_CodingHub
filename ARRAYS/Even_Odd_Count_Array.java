class Even_Odd_Count_Array
{
	public static void main(String args[])
		{
			int arr[]=new int[]{10,2,37,89,97,12,43};

			int even_count=0,odd_count=0;

			for(int x=0;x<arr.length;x++)
			{
				if(arr[x]%2==0)
				even_count++;

				else
				odd_count++;
			}
		System.out.println("even count is: "+even_count);
		System.out.println("Odd count is: "+odd_count);
		
		}
}