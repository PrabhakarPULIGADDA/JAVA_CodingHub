class Missing_elements_printing_ARRAY
{
	public static void main(String args[])
		{
			int a[]=new int[]{10,12,15,2,18,19};			

			for(int x=1;x<=20;x++)
			{
				int count=0;
				
				for(int temp:a)
				{

					if(x==temp)
					{
					count++;
					break;
					}
				}
				if(count==0)
				{
					System.out.println(x);
				}
			}
		}
	}