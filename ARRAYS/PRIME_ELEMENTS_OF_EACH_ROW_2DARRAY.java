
import java.util.Scanner;
class PRIME_ELEMENTS_OF_EACH_ROW_2DARRAY
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

		System.out.println("Prime elements of each row is: ");
		
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				isPrime(a[r][c],1,0);
			}
			System.out.println();

		}

	}
		static void isPrime(int num,int start,int count)
		{
			if(start>num)
			{
			if(count==2)
			System.out.print(num+" ");
			}

			else
			{
			if(num%start==0)
			count++;
			isPrime(num,start+1,count);
			}
		
		}
}
		
		

