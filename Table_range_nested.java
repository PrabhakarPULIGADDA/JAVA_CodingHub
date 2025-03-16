//accept a number and print table for each and every digit of a number

import java.util.Scanner;
	
class Table_range_nested
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number: ");
		int num=s.nextInt();

		while(num!=0)
		{
			int table=num%10;
			
			for(int start=1;start<=10;start++)
			{
				int prod=table*start;
				System.out.println(table+"x"+start+"="+prod);
			}
			
			num=num/10;
		}
	}
}