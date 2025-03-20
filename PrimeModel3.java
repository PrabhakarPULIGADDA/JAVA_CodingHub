class PrimeModel3
{
	int isPrime(int number,int count)
	{
		for(int x=1;x<=number;x++)
		{
			if(number%x==0)
			{
				count++;
			}
		}


		return count;
	}




	String checkPrime(int count)	
	{
		if(count==2)
			return "Prime";
		
		else
			 return "not Prime";

		
	}
}


class Main
{
	public static void main(String args[])
	{
		PrimeModel3 p=new PrimeModel3();
		int result=p.isPrime(4,0);
		System.out.println(p.checkPrime(result));
	}
}		


	