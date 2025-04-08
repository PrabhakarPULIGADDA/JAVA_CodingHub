//Input "A1B2C3D4@321"
//output ==> extract all the digits and then check weather they are palindrome or not


class Palindrome_String1
{
	public static void main(String args[])
	{
		String s1=new String("A1B2C3D4@321");
		
		String s2="";
		String rev="";

		for(int x=0;x<=s1.length()-1;x++)
		{
			if(s1.charAt(x)>='0'&&s1.charAt(x)<='9')
			{
				s2=s2+s1.charAt(x);
			}
		}

		
		for(int x=s2.length()-1;x>=0;x--)
		{
			char letter=s2.charAt(x);
			rev=rev+letter;

		}	
	System.out.println(rev);
	System.out.println(rev.equals(s2)?"Palindrome":"Not a Palindrome");
	}
}

		
		