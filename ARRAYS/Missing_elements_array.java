//Print the missing elements from an array
class Missing_elements_array
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,7,4,5};

		for(int x=1;x<=9;x++)
		{

			int count=0;

			for(int temp : arr)
			{
				if(x==temp)
				{
				count++;
				//break;
				}
			}
		if(count==0)
		System.out.println(x);
		}
	}
}