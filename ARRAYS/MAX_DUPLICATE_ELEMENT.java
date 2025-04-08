class MAX_DUPLICATE_ELEMENT
{
	public static void main(String args[])
	{
		
		
		int a[]=new int[]{7, 8, 9, 7, 8, 9, 7, 8, 9};
		int b[]=new int[a.length];
		
		int max=1,maxelement=0;
		
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
				if(count>max)
				{
					max=count;
					maxelement=a[x];
				}
		}

		System.out.println("the occuring is : "+maxelement+" occurred in "+max+ " times");
	}
}
			