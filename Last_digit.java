//11-03-2025
//extraction problems with do while

class Last_digit
{
 public static void main(String args[])
	{
          int num=145629;
		do
		{
			int res=num%10;
			System.out.println(res);
			num=num/10;
		}
		while(num!=0);
       }
}