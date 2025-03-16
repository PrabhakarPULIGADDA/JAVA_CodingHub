class  numberofdigits_even_odd_dowhile
{
	public static void main(String args[])
	{
		int num=123456342,count1=0,count2=0;
		
		do
		{
		int res=num%10;
		if(res%2==0)
		count1++;
		else
		count2++;
		num=num/10;
		}
		
		while(num!=0);
		System.out.println("number of even digits are :"+count1+"\nnumber of odd digits are :"+count2);
	}
}