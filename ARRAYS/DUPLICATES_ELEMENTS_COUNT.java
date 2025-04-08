class DUPLICATES_ELEMENTS_COUNT
{
	public static void main(String args[])
	{
		
		
		int a[]=new int[]{11, 22, 33, 22, 44, 55, 11};
		int b[]=new int[a.length];
	

		int DUPLICATE_count=0;
		
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
					System.out.print(a[x]+" ");
					DUPLICATE_count++;
				}
		}

		System.out.println("Duplicate elements count is: "+DUPLICATE_count);
	}
}
			