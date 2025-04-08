class LEAST_repeated_ELEMENT
{
	public static void main(String args[])
	{
		
		
		int a[]=new int[]{50,10,10,10,20,20,20,20,11,23,43,43,16};
		int b[]=new int[a.length];
		
		int max=Integer.MAX_VALUE,maxelement=1;
		
		for(int x=0;x<=a.length-1;x++)
		{
			int count=1;

			if(b[x]==1)
			continue;

			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==a[y])
				{
					if(a[x]==a[y])
					{
						count++;
						b[y]=1;
					}
				}
			}
				if(count<max&&count>1)
				{
					max=count;
					maxelement=a[x];

				}
		}

		System.out.println("least occuring is : "+maxelement+" occurred in "+max+ " times");

	}
}
			