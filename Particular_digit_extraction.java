import java.util.Scanner;

class Particular_digit_extraction
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number: ");
		int num=s.nextInt();


		
		int reverse=0,count=0;
		
		while(num>0)
		{
			int res=num%10;
			reverse=reverse*10+res;
			num/=10;
			count++;
		}
		System.out.println("No of digits are: "+count);
		       
			System.out.print("Enter the position you want: ");
		        int position=s.nextInt();
			
			if(position<=count)
			{

			int divider=(int)Math.pow(10,position-1);
			reverse=reverse/divider;
			int res=reverse%10;
			System.out.println(position + " position digit is: "+res);
			}
		
			else
			{
			System.out.println(position + "INVALID POSITION");
			}
			






		
	}
}