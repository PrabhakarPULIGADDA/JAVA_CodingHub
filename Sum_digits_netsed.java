//sum of digits from 10 to 100 using nested loops


class Sum_digits_netsed
{
      public static void main(String args[])
	{
		for(int x=10;x<=100;x++)
		{
			int num=x,sum=0,temp=num;

			while(num!=0)
			{
				int res=num%10;
				sum+=res;
				num/=10;
			}
			System.out.println("sum of the digits of: "+temp+" is: "+ sum);
	
		}
	}	

}

