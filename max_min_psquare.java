//check  every digit of the number is a prime or not

import java.util.Scanner;
class max_min_psquare
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number: ");
		int num=s.nextInt();
		int min=9, max=0,square=0,temp=num;
		
		

		while(num!=0)
		{
			int res=num%10;
			square=(int)Math.sqrt(res);
			if(square*square==res)
			{
				if(square>max)
				{
					max=res;	
				}
				if(square<min)
				{
					min=res;
				}
	
			}
			num=num/10;
		
		}
			System.out.println(max+"is the highest perfect square");
		
			System.out.println(min+"is the lowest perfect square");
		
	}

}	