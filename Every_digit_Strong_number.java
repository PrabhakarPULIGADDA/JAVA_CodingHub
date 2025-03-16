class Every_digit_Strong_number
{
	public static void main(String args[])
	{
		int num=12345;
		
		while(num!=0)
		{
		  int res=num%10;
				int product=1;
			for(int start=1;start<=res;start++)
			{
				product*=start;
			}
		 	System.out.println(res+"!"+"is"+product);
			System.out.println(res==product?res+" STRONG NUMBER ":res+" NOT  A STRONG NUMBER ");
		
			num=num/10;
		}
	}
}
		
				