import java.util.Scanner;

/*
class ARRAY_2D
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[4][4];


		System.out.println("Enter the array elements: ");
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{

				a[r][c]=sc.nextInt();
			}
		}


		System.out.println("Array After the inserting elements");

		for(int t1[]:a)
		{
			for(int t2:t1)
			{
				System.out.print(t2+" ");
			}

			System.out.println();
		}
	}
}
	
*/



class ARRAY_2D
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		Array array=new Array();
		
		int a[][]=new int[3][4];
		System.out.println("Enter the array elements: ");
		int b[][]=array.elementsTaking(a);
		System.out.println("array after inserting elements");
		array.arrayPrinting(b);
		


	}

}


class Array
{

	Scanner sc=new Scanner(System.in);
	int[][] elementsTaking(int a[][])
	{
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=a[x].length-1;y++)
			{
				a[x][y]=sc.nextInt();
			}
		}
		return a;
	}

	




	void arrayPrinting(int a[][])
	{
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{

				System.out.print(a[r][c]+"");

			}
			System.out.println();
		}
	}
}





