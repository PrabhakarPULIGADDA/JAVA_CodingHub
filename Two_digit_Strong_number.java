class Two_digit_Strong_number
{
	public static void main(String args[])
	{
		int num=4568,count=0,temp=num,sum=0;
		
		while(num>0)
		{
			int res=num%10;
			count++;
			num/=10;
		}
	
		if(count%2==0)
		{
			while(temp>0)
			{
		  
		 		int res1=temp%100,temp1=res1;
	         
				while(res1>0)//34>0
				{
		
		 			int res2=res1%10;
					int product=1;
					for(int start=1;start<=res2;start++)//1<=4//2<=4//3<=4//4<=4
					{
						product*=start;//24
					} 
							
					sum=sum+product;
			
					res1=res1/10;
				}
				System.out.println(temp1==sum?temp1+" STRONG NUMBER":temp1+" *NOT A STRONG NUMBER* ");
			
				temp=temp/100;
			
			 }
		
			
                 }
		
		else
		System.out.println("count is having odd digits");
 

		
	}
			
}