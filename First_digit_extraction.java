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
		int result=10;
		while(reverse>0)
		{
			int res=reverse%10;
			int position=s.nextInt();
			System.out.println("Enter the position you want: "+position);
			if(position%2==0)
			{
			result=res+result;
			System.out.println(position + "digit is: "+result);
			}
		
			else
			{
			 result=res+result;
		         System.out.println(position + "digit is: "+result);
			}
			
			reverse=reverse/10;






		}
	}
}