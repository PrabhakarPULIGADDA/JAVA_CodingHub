class LAST_UNIQUE
{
	public static void main(String args[])
	{
		
		
		int a[]=new int[]{1, 2, 3, 4, 5, 6};
		int b[]=new int[a.length];
		
		for(int x=a.length-1;x>=0;x--)
		{
			int count=1;
			if(b[x]==1)
			continue;
			
			for(int y=x-1;y>=0;y--)
			{
				if(a[x]==a[y])
				{
					count=a[x];
					break;
				}
			}

		if(count==1)
		System.out.println("Last  unique is: "+a[x]);
		break;


		}


	}
}
