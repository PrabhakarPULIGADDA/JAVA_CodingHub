class Array_Basic
{
	public static void main(String args[])
	{
		
		int arr[]=new int[5];
		int size=arr.length;

		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]='a';
		arr[4]=50;

		System.out.println(arr[3]+" char ");
		
		System.out.println(arr[size-1]);

		System.out.println(size);

		//System.out.println(arr[-1]);

	}
}