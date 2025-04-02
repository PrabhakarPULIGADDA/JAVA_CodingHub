//print characters in array with ascii  vales

import java.util.Random;
class Character_ASCII_value_printing
{
	public static void main(String args[])
	{
			
		Random r=new Random();
        	char arr[]=new char[]{'p','r','a','b','h','a','k','a','r'};

		System.out.println("Array characters are: ");

		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println ("\n Ascii value of arr["+i+"]="+ arr[i]+" is: "+(int)arr[i]);
		}
	}
}