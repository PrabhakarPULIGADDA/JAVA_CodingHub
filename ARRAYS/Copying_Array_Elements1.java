
//26-03-2025
/*a={10,20,30,40,50}
  b={ }

then size of array b must be same as a and copy all the elements of array a into array b */

import java.util.Scanner;

class Copying_Array_Elements1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of elements: ");
		int length=sc.nextInt();
		
		int a[]=new int[length];
		
		System.out.println("Enter the elements into the array: ");
		
		System.out.println("The first array is: ");
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
	

		int b[]=new int[a.length];
		System.out.println("The elements copied array is: ");

		for(int x=0;x<b.length;x++)
		{
			b[x]=a[x];
			System.out.println(b[x]);
		}

	}
}


		