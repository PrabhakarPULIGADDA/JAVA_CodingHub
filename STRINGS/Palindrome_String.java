//check weather a string is palindrome or not

class Palindrome_String
{
	public static void main(String args[])
	{
		String s=new String("liril");
		String rev="";		

		for(int x=s.length()-1;x>=0;x--)
		{
			char letter=s.charAt(x);
			rev=rev+letter;

		}
	
	System.out.println(rev.equals(s)?"Palindorome":"Not a Palindrome");
	}
}