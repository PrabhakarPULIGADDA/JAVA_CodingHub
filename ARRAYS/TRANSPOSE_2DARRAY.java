/*
import java.util.Scanner;
class TRANSPOSE_2DARRAY
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
				System.out.print(a[c][r] + " ");		
			}
			System.out.println();
		}


	int maxCols = 0;
        for (int r = 0; r < a.length; r++) {
            if (a[r].length > maxCols) {
                maxCols = a[r].length;
            }
        }
		  System.out.println("Transpose of the array is: ");
        for (int c = 0; c < maxCols; c++) {
            for (int r = 0; r < a.length; r++) {
                if (c < a[r].length) {
                    System.out.print(a[r][c] + " ");
                } else {
                    System.out.print("  "); // blank for missing value
                }
            }
            System.out.println();
        }



}
}*/




import java.util.Scanner;

class TRANSPOSE_2DARRAY {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the array: ");
        int a[][] = new int[sc.nextInt()][];

        for (int r = 0; r <= a.length - 1; r++) {
            System.out.println("Enter number of columns for row " + r + ":");
            a[r] = new int[sc.nextInt()];
        }

        System.out.println("Enter the array elements: ");
        for (int r = 0; r <= a.length - 1; r++) {
            for (int c = 0; c <= a[r].length - 1; c++) {
                a[r][c] = sc.nextInt();
            }
        }

        System.out.println("The array is: ");
        for (int r = 0; r <= a.length - 1; r++) {
            for (int c = 0; c <= a[r].length - 1; c++) {
                System.out.print(a[r][c] + " ");
            }
}
}
}