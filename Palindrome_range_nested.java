class Palindrome_range_nested
{
	public static void main(String args[])
		{
			for(int start=1;start<=10000;start++)
			{
				int num=start,reverse=0,temp=num;
			
				while(num!=0)
				{
					int rem=num%10;
					reverse=reverse*10+rem;
					num=num/10;
				}
			if(reverse==temp)
			System.out.println(temp+" is a PALINDROME ");
			
			}
		}
}
