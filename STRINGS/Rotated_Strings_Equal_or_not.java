import java.util.Scanner;
import java.util.Arrays;

class Rotated_Strings_Equal_or_not 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the String: ");
		
		String s1=sc.next();
			
		System.out.println("enter the Second String: ");
		
		String s2=sc.next();

		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
	

		int rotate=arr1.length;

		if(arr1.length==arr2.length)
		{
			while(rotate!=0)
			{
				char temp=arr1[arr1.length-1];
				for(int x=arr1.length-1;x>0;x--)
				{
					arr1[x]=arr1[x-1];
				}
					arr1[0]=temp;
				if(Arrays.equals(arr1,arr2))
				{
					System.out.println("equals");
					break;

				}
			rotate--;
			}
			if(rotate==0)
			System.out.println("Not equal");
		
	       }
	
	}
}

		