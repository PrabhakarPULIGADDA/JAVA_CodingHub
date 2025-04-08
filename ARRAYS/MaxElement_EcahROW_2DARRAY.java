
import java.util.Scanner;
class MaxElement_EcahROW_2DARRAY
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows in the array: ");
		int a[][]=new int[sc.nextInt()][];
	
		int maxrow=0;
		int maxcol=0;

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


		for(int r=0;r<=a.length-1;r++)
		{
			int max=Integer.MIN_VALUE;
			for(int c=0;c<=a[r].length-1;c++)
			{
				if(a[r][c]>max)
				{
					max=a[r][c];
				}		
			}
			System.out.println("The maximum in row"+r+ " element is: " + max);
		}
	
	}
}