
import java.util.Scanner;


class TwinPrime
{
public static void main(String args[])
{

Scanner s=new Scanner(System.in);
System.out.println("Enter the number: ");
int num1=s.nextInt();
int count=0,count1=0,num2=0;
		
	for(int start=2;start<=num1/2;start++)
	{
		if(num1%start==0)
		{
			count++;
		}
	}
	

	if(count==0)
	{
		num2=num1+2;
		for(int start=2;start<=num2/2;start++)
		{
			if(num2%start==0)
			{
			count1++;
			}
		}
	
		if(count1==0)
		{
			System.out.println(num1+" "+num2+" are twinPrime");
		}

		else
		{
		System.out.println(num1 + " is prime but " + num2 + " is not, so they are not twin primes");
		}
	}
	else
	System.out.println(num1 + " is not a prime number.");
	
        




}
}

	