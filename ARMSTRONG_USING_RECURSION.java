class ARMSTRONG_USING_RECURSION
{
	
	public static void main(String args[])
	{
		ARMSTRONG arm=new ARMSTRONG();
		int arr[]=new int[]{153,123,8,93,9474,7,120,345,23};
		for(int t:arr)
		{
		int count=arm.calCount(t,0);
		int s=arm.calPowerSum(t,count,0);
		arm.checkArmstrong(t,s);
		}
	}
}



class ARMSTRONG
{

	int calCount(int num,int count)
	{
		if(num==0)
		{
			return count;
		}

		else
		{
			count++;
			return calCount(num/10,count);//num we are modifying and the count is updated	
		}
	
	}

	
	int calPowerSum(int num,int count,int sum)
	{
		if(num==0)
		{
			return sum;
		}
		else
		{
			int res=num%10;
			int power=(int)Math.pow(res,count);
			sum+=power;

			return calPowerSum(num/10,count,sum);
		}



	}

	void checkArmstrong(int n,int sum)
	{

		if(n==sum)
		{	
			System.out.println(n);
		}
	}
}