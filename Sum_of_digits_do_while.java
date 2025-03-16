class Sum_of_digits_do_while
	{
		public static void main(String args[])
		{
			int num=12345,sum=0;
			do
			{
			 int res=num%10;
			 sum+=res;
			 num=num/10;
			}
			while(num!=0);
			System.out.println(sum);
		}
}