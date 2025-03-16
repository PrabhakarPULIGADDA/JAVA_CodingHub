//Armstrong number between 1 to 10000

class Armstrong_nested
	{
		public static void main(String args[])
		{
			for(int x=0;x<=10000;x++)
			{
				int num=x,count=0,temp=num,sum=0;
	
				while(num!=0)
				{
					int rem=num%10;
					count++;
					num=num/10;
                                }
			
				num=temp;
				while(num!=0)
				{
					int res=num%10;
					int power=(int)Math.pow(res,count);
					sum+=power;
					num=num/10;
				}
		
			if(sum==temp)
			System.out.println(temp+" IS AN ARMSTRONG NUMBER ");
		
			}
		}
	}