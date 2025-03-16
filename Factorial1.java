class Factorial
{
	public static void main(String args[])
	{
	int num=5,start=1,end=num,product=1;
	
	while(start<=end)
	{
		product*=start;
	        start++;
       }
              System.out.println(product);
	}
}

