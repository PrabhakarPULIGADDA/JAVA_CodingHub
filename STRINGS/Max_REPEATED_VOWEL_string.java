import java.util.Scanner;
class Max_REPEATED_VOWEL_string
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		int a_max=0,e_max=0,i_max=0,o_max=0,u_max=0;

		for(int x=0;x<=s.length()-1;x++)
		{
			char letter=s.charAt(x);
		
			if(letter=='A'||letter=='a')
				a_max++;
			else if(letter=='E'||letter=='e')
				e_max++;
			else if(letter=='I'||letter=='i')
				i_max++;
			else if(letter=='O'||letter=='o')
				o_max++;
			else if(letter=='U'||letter=='u')
				u_max++;
		}

		/*System.out.println("a_max is: "+a_max);
		System.out.println("e_max is: "+e_max);
		System.out.println("i_max is: "+i_max);
		System.out.println("o_max is: "+o_max);
		System.out.println("u_max is: "+u_max);*/
		
		
		

		
		int max=a_max;
		if(e_max>max)
		max=e_max;
		if(i_max>max)
		max=o_max;
		if(o_max>max)
		max=i_max;
		if(u_max>max)
		max=u_max;

		
		if(max>0)
		{
		if(a_max==max)
		System.out.println("Max repetead vowel is A");

		if(e_max==max)
		System.out.println("Max repetead vowel is E");
		
		if(i_max==max)
		System.out.println("Max repetead vowel is I");

		if(o_max==max)
		System.out.println("Max repetead vowel is O");

		if(u_max==max)
		System.out.println("Max repetead vowel is U");
		}

		else
		System.out.println("No vowel found or not repeated");

	}
}