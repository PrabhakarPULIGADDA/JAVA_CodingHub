//factorial of every digit of the number

import java.util.Scanner;
class Factorial_range_nested
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number: ");
		int num=s.nextInt();
		long fact=1;

		while(num!=0)
		{
			int res=num%10;
			
			for(int start=1;start<=res;start++)
			{
			fact*=start;	
			}
			
			System.out.println(res+"!"+fact);
			
			num=num/10;
		}
		
	}

}	