//Difference between + and concat

class Difference_Between_Plus_Concat
{
	public static void main(String args[])
	{
		String main="hai @123 GoodMorning";

		/*main="Hello,"+main+999+'*'+'&';

		System.out.println(main+" using Plus");*/

	
		//By using concat we can only concat the Two Strings
		System.out.println(main.concat("Prabhakar"));
	}
}