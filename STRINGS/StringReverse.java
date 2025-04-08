//String in reverse order

class StringReverse
{
	public static void main(String args[])
		{
			String s=new String("Hello wellcome");
		
			System.out.println("String after Reversing");
			for(int x=s.length()-1;x>=0;x--)
			{
				System.out.println(s.charAt(x));
			}
		}
}