import java.util.Scanner;
class DUPLICATE_WORDS_IN_A_STRING
{
	public static void main(String args[])
		{
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the String: ");
		
		String s=sc.nextLine();
		String s2="";
		
		String a[]=s.split(" ");

		for(String t:a)
		{
			String word=t;
			
			if(s.indexOf(word)!=s.lastIndexOf(word))
			{
				if(s2.indexOf(word)==-1)
				{
					s2=s2+word;
				}
			}
		}
		System.out.println(s2);


	}
}