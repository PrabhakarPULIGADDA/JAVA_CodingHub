
import java.util.Scanner;
class SumOfEachRow_OveralSum_2DARRAY
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows in the array: ");
		int a[][]=new int[sc.nextInt()][];
	
		int overal_sum=0;
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
				overal_sum+=a[r][c];
			}
		}

		System.out.println("array after inserting elements");

		for(int r=0;r<=a.length-1;r++)
		{
			int sum=0;
			for(int c=0;c<=a[r].length-1;c++)
			{
				sum=sum+(a[r][c]);
				System.out.print(a[r][c] + " ");		
			}
			System.out.println("Sum of row " + r + " is: " + sum);

		}

		System.out.println("overall sum is: "+overal_sum);

	}
}