import java.util.Scanner;
class Duplicate_Char_Using_INDEXOF
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the String: ");

		String s=sc.nextLine();
		String s2="";
		
	for(int x=0;x<=s.length()-1;x++)
	{
		char letter=s.charAt(x);
		if(s.indexOf(letter)!=s.lastIndexOf(letter))
		{
			if(s2.indexOf(letter)==-1)
			{
				s2=s2+letter;
			}
		}
	}	
		
		System.out.println(s2+" ");
}
}
	

