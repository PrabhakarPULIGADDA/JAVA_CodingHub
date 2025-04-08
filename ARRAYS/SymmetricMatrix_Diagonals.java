import java.util.Scanner;
class SymmetricMatrix_Diagonals
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];

		System.out.println("enter the array elements: ");
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				a[r][c]=sc.nextInt();
			}
		}

		System.out.println("the left diagonal of the array is: ");
		
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
				{
					if(r==c || r+c==a.length-1)
					System.out.print(a[r][c]+" ");
					else
					System.out.print("  ");
				}
				System.out.println();
		}
		
		//System.out.println("the right diagonal of the array is: ");
		
		/*for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
				{
					if(r+c==a.length-1)
					System.out.println(a[r][c]+" ");
					else
					System.out.print("  ");
				}
				System.out.println();
		}
		*/
	}
}