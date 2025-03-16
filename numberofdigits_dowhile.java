class  numberofdigits_dowhile
{
	public static void main(String args[])
	{
		int num=123456342,count=0;
		
		do
		{
		int res=num%10;
		count++;
		num=num/10;
		}
		
		while(num!=0);
		System.out.println("count is :"+count);
	}
}