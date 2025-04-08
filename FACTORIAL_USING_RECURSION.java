class FACTORIAL_USING_RECURSION
{
	public static void main(String args[])
	{
		FACTORIAL f=new FACTORIAL();
		
		int n=3;
		System.out.println(f.calFactorial(n,1,1));	
	}
}



class FACTORIAL
{
	int calFactorial(int n,int start,int fact)
		{
			if(start>n)
			{
				return fact;
			}

			else
			{
				fact=fact*start;	
				return calFactorial(n,start+1,fact);
			}
		}
}