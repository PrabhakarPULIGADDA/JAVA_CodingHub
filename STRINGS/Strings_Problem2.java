class Strings_Problem2
{
	public static void main(String args[])
	{
		String s=new String("HELLO all");
		String es="";
		String os="";
		String es_reverse="";	
		String f="";

		for(int x=0;x<=s.length()-1;x++)
		{
			if(x %2==0)
			es=es+s.charAt(x);

			else
			os=os+s.charAt(x);
		}
		
		for(int x= es.length()-1;x>=0;x--)
		{
			es_reverse=es_reverse+es.charAt(x);
		}

		System.out.println(es_reverse.toLowerCase()+os.toUpperCase());
	}
}
		