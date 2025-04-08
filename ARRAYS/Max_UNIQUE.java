class Max_UNIQUE
{
	public static void main(String args[])
	{
		
		
		int a[]=new int[]{10, 20, 30, 40, 50, 60};
		int b[]=new int[a.length];
		
		int max=0;
		
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
				
				if(count==1&&a[x]>max)
				{
				max=a[x];
				}
				
			
		}
		
	System.out.println("maximum unique is: "+max);
	
}	

}
	

