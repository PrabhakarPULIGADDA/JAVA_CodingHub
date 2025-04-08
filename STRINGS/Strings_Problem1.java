
//input:"ApPle 1@"
//Output:"aPpLE 1@"
class Strings_Problem1
{
	public static void main(String args[])
	{
		String s=new String("ApPle 1@");
		String s1="";

		for(int x=0;x<=s.length()-1;x++)
		{
			char letter=s.charAt(x);
		
			if(letter>='A'&&letter<='Z')
			{
				letter=(char)(letter+32);
				s1+=letter;
			}
		
			else if(letter>='a'&&letter<='z')
			{
				letter=(char)(letter-32);
				s1+=letter;
			}
			
			else
				s1+=letter;
		}

	System.out.println(s1);
	}
}