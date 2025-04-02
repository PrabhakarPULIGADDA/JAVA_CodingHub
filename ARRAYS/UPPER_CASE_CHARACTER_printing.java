//print only upper case characters in an array

import java.util.Random;
class UPPER_CASE_CHARACTER_printing
{
	public static void main(String args[])
	{
			
		Random r=new Random();
        	char arr[]=new char[]{'P','r','A','b','H','a','k','a','R'};

		System.out.print("Array characters are: "+"\n");

		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
		
		
		for(int i=0;i<=arr.length-1;i++)
		{

			if(Character.isUpperCase(arr[i]))
			System.out.println(arr[i]+" ");

		}
	}
}