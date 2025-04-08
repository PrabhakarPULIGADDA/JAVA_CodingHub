/*
class LAST_DUPLICATE
{
	public static void main(String args[])
	{
		
		
		int a[]=new int[]{100, 200, 100, 300, 100, 400, 200, 100};
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
					count++;
					b[y]=1;
				}
			}

		if(count>1)
		System.out.println("Last  duplicate is: "+a[x]);
		break;


		}


	}
}


*/

class LAST_DUPLICATE
{
	public static void main(String args[])
	{
		
		
		int a[]=new int[]{100, 200, 100, 300, 100, 400, 200, 100};
		int b[]=new int[a.length];
		
		for(int x=a.length-1;x>=0;x--)
		{
			int count=0;
			
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

		if (count != 0) 
		{
		System.out.println("Last duplicate is: " + count);
		break;
		}
        	else
           	 System.out.println("No duplicates found");
	}
}
	
}			















					