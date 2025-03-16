class  even_sum_odd_prod_dowhile
{
	public static void main(String args[])
	{
		int num=123456342,sum=0,product=1;
		
		do
		{
		int res=num%10;
		if(res%2==0)
		sum+=res;
		else
		product*=res;
		num=num/10;
		}
		
		while(num!=0);
		System.out.println("even sum is :"+sum+"\n odd product is:"+product);
	}
}