//sum of 1st ten natural numbers


import java.util.Scanner;
class sum_natural_numbers_for
{
    public static void main(String args[])
	{

		Scanner s=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=s.nextInt();
		System.out.println("Enter number : "+num);
		int sum=0;

		for(int start=1;start<=num;start++)
		{
	     		sum+=start;
		}
		System.out.println("sum of 1st "+num+ " numbers is: "+sum);
	}
}