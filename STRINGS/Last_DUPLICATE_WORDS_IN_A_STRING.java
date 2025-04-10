import java.util.Scanner;
class Last_DUPLICATE_WORDS_IN_A_STRING
{
	public static void main(String args[])
		{
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the String: ");
		
		String s=sc.nextLine();
		String s2="";
		
		String a[]=s.split(" ");

		for(int x=a.length-1;x>=0;x--)
		{
			String word=a[x];
			
			if(s.indexOf(word)!=s.lastIndexOf(word))
			{
				if(s2.indexOf(word)==-1)
				{
					System.out.print("last duplicate is: "+word);
					break;
				}
			}
		}



	}
}