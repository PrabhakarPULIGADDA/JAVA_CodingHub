//5-03-2025
//while loop
class Num
{
	public static void main(String args[])
	{
		int num=3,start=0;
		
		while(num!=1)
		{
		  if(num%2==0)
		  {
		    num=num/2;
                    System.out.println(num);
		  }
			
                  else
		  {
		   num=3*num+1;
		   System.out.println(num);
		  }
		}
		
	}
}	