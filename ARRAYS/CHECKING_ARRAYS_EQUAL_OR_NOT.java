class CHECKING_ARRAYS_EQUAL_OR_NOT
{
	public static void main(String args[])
		{
			int a[]=new int[]{-1,-2,4,35,234};
			int b[]=new int[]{1,2,34,34,45,67,90};

			int count1=0,count2=0;

			if(a.length==b.length)
			{
				for(int x=0;x<=a.length-1;x++)
				{
					count1++;
				
						for(int i=0;i<=x;i++)
						{

							if(a[x]==b[i])
							{
								count2++;
							}
						}
				}


				if(count1==count2)
					System.out.println("the arrays are ewqual");

				else
					System.out.println("The arrays are not equal");	
			}

			else
			System.out.println("The size is not same so they are not equal");

			
		}
}