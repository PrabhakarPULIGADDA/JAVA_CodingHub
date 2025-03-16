//5-03-2025
//Print the count for the numbers divisible by both 3 and 5 b/w 1 to 100
//HERE THEY WANT NUMBER OF SO WILL USE **COUNT**

class Count_for_the_numbers_divisible
{
	public static void main(String args[])
	{
		int start=1,end=100,count=0;
		
		while(start<=end)
		{
		int num=start;
		
		if(num%3==0 && num%5==0)
		{
                  count++;
		}
		start++;
		}
		System.out.println("Count is : "+count);
	}
}
		