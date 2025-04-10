import java.util.Scanner;
class Removing_Duplicate_Spaces_from_String
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the String: ");

		String s=sc.nextLine();

		String arr[]=s.split(" ");

		String res="";
		
		System.out.println("before length is: "+s.length());
		for(int x=0;x<=arr.length-1;x++)	
		{	
			if(!arr[x].equals(""))

			{
				res=res+arr[x]+" ";
			}
		}
	
		res=res.trim();
		System.out.println("After length is: "+res.length());
		
		System.out.println(res);
	
		
	}
}