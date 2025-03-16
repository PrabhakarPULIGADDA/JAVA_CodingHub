//5-03-2025
//while loop
//Write a program to print  Factorial of a number in reverse order


class Factorial_reverse_order
{
	public static void main(String args[])
	{
		int n=4,start=n,end=1,fact=1;
		
		while(start>=end) //5>=1 t //4>=1t //3>=1t//2>=1t //1>=1t //0>=1 f
		{
			fact=fact*start; //1=1*5=5 //5=5*4=20 //20=20*3=60 // 60=60*2=120 //120=120*1=120
			start--; //5-1=4 //4-1=3 // 3-1=2 //2-1=1 //1-1=0
		}
	System.out.println("Factorial of "+n+"is: "+fact);
	}
}