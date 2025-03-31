//Copy even index values into another array

import java.util.Scanner;

class EvenIndex_Coppy_Array
{
	public static void main(String args[])	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of a array: ");
		int length=sc.nextInt();
		int arr1[]=new int[length];

		System.out.println("Enter the array elements: ");

		for(int x=0;x<arr1.length;x++)
		{
			arr1[x]=sc.nextInt();
		}
		
		int e_size=0;

		if(arr1.length%2==0)
		{
		e_size=(arr1.length/2);
		}

		else
		{
		e_size=(arr1.length/2)+1;
		}


		System.out.println(e_size+" b array size is");


		
		int arr2[]=new int[e_size];

		int y=0;
		for(int x=0;x<=arr1.length-1;x++)
		{
				if(x % 2==0)
				{
					arr2[y]=arr1[x];
					y++;
				}
		}

		System.out.println("array after copying even indexes");

		for(int x=0;x<=arr2.length-1;x++)
		{
			System.out.println(arr2[x]);
		}
	}
}


