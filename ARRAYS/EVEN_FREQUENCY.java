
class EVEN_FREQUENCY
{
	public static void main(String args[])
	{
		
		
		int a[]=new int[]{10,20,30,10,20,40,50,56,23,10,30,50,10,45,67,23};
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
			
			if(count%2==0)
			{	
		      System.out.println(a[x]+" "+count);
			}
		}
	}
}

