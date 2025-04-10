import java.util.Scanner;
class CapitalizeFirstLastInWords
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the String: ");

		String s=sc.nextLine();

		String arr[]=s.split(" ");
		
		String res=" ";

		for(String t:arr)
		{
			for(int x=0;x<=t.length()-1;x++)
			{
				char letter=t.charAt(x);

				if(x==0||x==t.length()-1)
				{
						res=res+Character.toUpperCase(letter)+"";
				}
					
				else
					res=res+Character.toLowerCase(letter)+"";

			}
			res=res+" ";
		}
		System.out.print(res);
	}
}