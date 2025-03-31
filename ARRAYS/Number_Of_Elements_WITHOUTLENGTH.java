//print the number of elements in array without using LENGTH property

class Number_Of_Elements_WITHOUTLENGTH
{
public static void main (String args[])
{
	int arr[]=new int[]{-1,354,27,89,354,783,32,8,7};
	int count=0;
	for(int temp: arr)
	{
		count++;
	}

	System.out.println("the number of elements in array are: "+count);
}
}