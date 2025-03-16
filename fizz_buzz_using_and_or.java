//28-02-2025

//write a code to print "FIZZ-BUZZ" if a number is divisible by both 3 and 5..Print last digit of the number if the number id divisible by 7 or 9..


class fizz_buzz_using_and_or
{
	public static void main(String args[])
		{
			int num=45;
				
			if(num % 3==0 &&num % 5==0)
			
				System.out.println("FIZZ-BUZZ");		
			
			else if(num % 7==0 || num%9==0)
			{
				int result=num%10;
				System.out.println(result);
			}
		}
}