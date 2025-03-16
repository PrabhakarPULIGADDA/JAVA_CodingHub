//06-03-2025
//check weathe the given number is prime or not

class Prime_using_while
{
	public static void main(String args[])
	{
          int num=4s,start=1,end=num,count=0;
		while(start<=end)
		{
		  if(num%start==0)
		  {
			count++;
		  }
		start++;
		}
           System.out.println(count==2?"PRIME NUMBER":"NOT PRIME");
        }
}