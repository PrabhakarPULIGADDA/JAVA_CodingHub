class FIRST_UNIQUE
{
	public static void main(String args[])
	{
		
		
		int a[]=new int[]{10, 10, 20, 20, 30, 30};
		int b[]=new int[a.length];

		for(int x=0;x<=a.length-1;x++)
		{
			int count=1;
			
			if (b[x] == 1)  
                	continue;
				
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]==a[y])
				{
					count++;
					b[y]=1;
				}
			}

		if(count==1)
		{
		System.out.println("the first unique is: "+a[x]);
		break;
		}

		/*else
		{
			System.out.println("no unique elements found");
		}*/
		}
	}
}
