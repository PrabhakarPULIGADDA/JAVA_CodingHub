import java.util.Scanner;
class Digit_present_or_not
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("enter the number: ");
		int num=s.nextInt();
		
		System.out.print("Enter the digit you want to check: ");
		int digit=s.nextInt();
		
		int temp=num;
		int reverse=0,count=1,count1=0;
  		
			

		while(num>0)
		{
			int res=num%10;
			reverse=reverse*10+res;
			num/=10;
			
		}



		while(reverse>0)
		{
			int res=reverse%10;

				if(res==digit)
				{
					System.out.println(digit+" is present in the given "+temp+ " number at: "+count);
					count1++;
											
				}
				
				  count++;
			reverse/=10;
		}
		

			

				System.out.println( "no of times " +digit+ " present is : "+count1);


		
	}
}
			
    			
		