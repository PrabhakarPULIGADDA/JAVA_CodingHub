import java.util.Arrays;
import java.util.Scanner;
class String_element_found_Or_not
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the String");
		
		String s=sc.nextLine();

		char array[]=s.toCharArray();
		
		Arrays.sort(array);

		System.out.println(Arrays.toString(array));

		String_element_found_Or_not e=new String_element_found_Or_not();

		System.out.println("enter the element");
		char search=sc.next().charAt(0);
		
		e.binarysearch(array,search);	

	}

		void binarysearch(char Array[],char search)
		{
		      int start=0,end=Array.length-1,mid=0;
			while(start<=end)
			{
				mid=(start+end)/2;

			if(Array[mid]==search)
			{
				System.out.println("element found");
				break;
			}
			
			else if(search >Array[mid])
			start=mid+1;

			else
			end=mid-1;
			}
		if(start>end)
		System.out.println("element not found");
		}


}