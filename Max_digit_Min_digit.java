class Max_digit_Min_digit
	{
	   public static void main(String args[])
		{
			 int num=127,min=10,max=0,temp=num;
			
			while(num!=0)
			{
			  int res=num%10;
			   
			  if(res>max)
			  max=res;
			 
		          num=num/10;
			}
			
			System.out.println("max "+max);
			
			wile(temp!=0)
			{
			int res=nun%10;
	

    			if(res<min)
			min=res;
			
			num=num/10;
			}
			System.out.println("min "+min);
			System.out.println("product is  "+max*min);

 
		




