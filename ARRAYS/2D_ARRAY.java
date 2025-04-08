import java.util.Scanner;
class ARRAY_2D
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[2][4];

		for(int r=0;x<=a.length-1;x++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{

				a[r][c]=sc.nextInt();
			}
		}


		System.out.println("Array After the inserting elements");

		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				System.out.println(a[r][c]);
			}

			System.out.println();
		}
	}
}
		