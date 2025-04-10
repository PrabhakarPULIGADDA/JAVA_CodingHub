import java.util.Scanner;
class PALINDROMES_IN_A_String
{
	public static void main(String args[])
		{
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the String: ");

		String s=sc.nextLine();

		String arr[]=s.split(" ");

		for(String t:arr)
		{
			
			StringBuffer sb=new StringBuffer(t);
			sb.reverse();
	
			if(t.contentEquals(sb))
			{
				System.out.print(t+" ");
			}
		}
	}
}

		