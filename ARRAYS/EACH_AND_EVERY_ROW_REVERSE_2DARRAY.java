
import java.util.Scanner;
class EACH_AND_EVERY_ROW_REVERSE_2DARRAY
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the no of rows in the array: ");
		int a[][]=new int[sc.nextInt()][];
	

		for(int r=0;r<=a.length-1;r++)
		{
			System.out.println("Enter row"+r+"columns");
			a[r]=new int[sc.nextInt()];
		}

		System.out.println("enter the array elements: ");
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				a[r][c]=sc.nextInt();
			}
		}
		

		System.out.println("the array is: ");

		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				System.out.print(a[r][c] + " ");		
			}
			System.out.println();

		}

		System.out.println("after reversing each and every row: ");
		
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=a[r].length-1;c>=0;c--)
			{
				System.out.print(a[r][c] + " ");		
			}
			System.out.println();

		}

		
	}
}
		
		

