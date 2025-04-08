
class Strings_Problem3
{
	public static void main(String args[])
	{
		//String s="343dsfd3434";
		String s=" a 1 man & a plan_a canal,panama";
		String s1="";

		for(int x=0;x<=s.length()-1;x++)
		{
			char letter=s.charAt(x);
			
			if(letter>='A'&&letter<='Z' || letter>='a'&&letter<='z')
			{
				s1=s1+letter;
			}

		}

		System.out.println(s1);

		
		
		/*String s1_rev="";
		
		for(int x=s1.length()-1;x>=0;x--)
		{
			char letter=s1.charAt(x);
			s1_rev+=letter;

		}

		System.out.println(s1.equalsIgnoreCase(s1_rev)?"Palindrome":"Not a palindrome");*/
		//will use Contentequals() for comparision




		//reverse() predefined function present in StringBuffer so we need to create obj

		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		System.out.println(s1.contentEquals(sb)?"Palindrome":"Not a palindrome");
		




	}
}
