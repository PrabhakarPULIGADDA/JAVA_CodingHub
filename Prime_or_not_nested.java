//check  every digit of the number is a prime or not

import java.util.Scanner;
class Prime_or_not_nested
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number: ");
		int num=s.nextInt();
		
		

		while(num!=0)
		{
			int count=0;
			int res=num%10;
			
			for(int start=2;start<=res/2;start++)
			{
				if(res%start==0)
				{
				count++;
				break;	
				}
				
			}
			
			if(count==0&&res>=2)
			System.out.println(res+"is a PRIME");
			else
			System.out.println(res+"is not a PRIME");
			
			num=num/10;
		
		}
		
	}

}	