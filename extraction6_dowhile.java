class  extraction6_dowhile
{
	public static void main(String args[])
	{
		int num=12345,count=0,temp=num;
		
		do
		{
		int res=num%10;
		count++;
		num=num/10;
		}
		
		while(num!=0);
		System.out.println("count is :"+count);
		
		if(count%2==0)
		{
		int divider=(int)Math.pow(10,count/2);
		int left_part=temp%divider;
		int right_part=temp/divider;
		System.out.println(left_part+right_part);
		}
		else
		{
		  int res=temp%10;
		  int remaining=temp/10;
		  System.out.println(res+remaining);
		}



		
	}
}