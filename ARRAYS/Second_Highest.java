class Second_Highest
{
	public static void main(String args[])
	{
		int a[]=new int[]{12,354,56,23,245,03};

		int max=Integer.MIN_VALUE,second_max=0;

		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]>max)
			{
				second_max=max;
				max=a[x];
			}

			else if(a[x]<max && a[x]>second_max)
			{
				second_max=a[x];
			}
		}
		System.out.println("SecondMax is: "+second_max);
	}
}
			