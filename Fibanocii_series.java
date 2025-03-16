class Fibanocii_series
{
  public static void main(String args[])
 	{
		int a=0,b=1,c=0,start=0,number=5;
		System.out.println("firt term is: "+a+"Second_term is: "+b);
		while(start<number)
		{	
			c=a+b;
			System.out.println(c);
			
			a=b;
			b=c;
			
			start++;
		}
	}
}
			

			