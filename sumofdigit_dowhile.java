class sumofdigit_dowhile
{
	public static void main(String args[])
	{
		int num=123,sum=0;
		
		do
		{
		int res=num%10;
		sum+=res;
		num=num/10;
		}

		while(num!=0);
		System.out.println("sum is :"+sum);
       }
}