 
import java.util.Scanner;

class Table_for
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the table you want: ");
		int table=s.nextInt();
		
		for(int start=1;start<=10;start++)
		{
			int prod=table*start;
			System.out.println(table+"X"+start+"="+prod);
		}
	}
}