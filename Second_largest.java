    
import java.util.Scanner;

class Second_largest
	{
	    public static void main(String args[])
		{
			Scanner s=new Scanner(System.in);
			System.out.print("enter the number:");
			int num=s.nextInt();
			


			
			int max=0,temp=num,second_max=0;

			while(num!=0)
			{
			int res=num%10;
			
			if(res>max)
			max=res;
			
			num=num/10;
			}
			System.out.println("first Largest is "+max);

 			while(temp>0)
			{
				int digit=temp%10;
				if(digit<max&&digit>second_max)
				{
				second_max=digit;
				  
				}
				
                     		 temp=temp/10;
			}
			
			System.out.println("Second largest"+second_max);

		}
	}
	
			
		