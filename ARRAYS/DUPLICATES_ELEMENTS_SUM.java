class DUPLICATES_ELEMENTS_SUM
{
	public static void main(String args[])
	{
		
		
		int a[]=new int[]{7, 8, 9, 7, 8, 9, 10};
		int b[]=new int[a.length];
	

		int sum=0;
		
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
				if(count>1)
				{
					sum+=a[x];	
				}
		}

		if(sum==0)
		System.out.println("no duplicates found");
		else
		System.out.println("Duplicate elements sum is: "+sum);
	}
}
			