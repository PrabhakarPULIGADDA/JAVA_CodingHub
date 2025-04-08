class StringBasic
{
	public static void main(String args[])
	{
		String s=new String("Hello all Wellcome to my Space");
		
		System.out.println(s.length());//length() is used to find the no of characters in the array

		//charAt() is used to accaes the characters in ana array

		for(int x=0;x<=s.length()-1;x++)
		{
			char letter=s.charAt(x);
			System.out.print(letter);
		}
	}
}