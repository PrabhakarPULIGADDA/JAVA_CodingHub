

import java.util.Scanner;
class Factoril_for
{ 
	public static void main(String args[])
	{
	     
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		int fact=1;
	
		for(int start=1;start<=num;start++)
		{
			fact*=start;
		}
			
		System.out.println(num+"!"+" is "+fact);
	}
}
		