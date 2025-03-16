class Extraction3
{
	public static void main(String args[])	
		{
			int num=65421,reverse=0,temp=num,product1=1,product2=1,sum=0;


			while(num!=0)
			{
			  int rem=num%10;
			 reverse=reverse*10+rem;
			  num=num/10;
			}
			System.out.println(reverse);

			while(reverse!=0&&temp!=0)
			{ 
 			product1=reverse%10;
			product2=temp%10;
			while(product1!=product2)
                        {
			sum=product1+product2;
			reverse=reverse/10; 
			temp=temp/10;
			}
			sum=sum+product1;
  			}
			System.out.println(sum);


		}
} 