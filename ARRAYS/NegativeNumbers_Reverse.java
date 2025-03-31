/*class NegativeNumbers_Reverse
{
	public static void main(String args[])
	{
		int a[]=new int[]{10,-3,56,78,24,-7,12,-4,-5,78};

		int count=0;
	
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<0)
			{
				System.out.println(a[x]);
				count++;
			}
		}

		
		int b[]=new int[count];
	
		int y=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<0)
			{
				b[y]=a[x];
				y++;
			}
		}
			
		System.out.println(b.length);

		System.out.println("array after reversing negative numbers: ");

		for(int x=b.length-1;x>=0;x--)
		{
			System.out.println(b[x]);
		}


	}
}
*/








class NegativeNumbers_Reverse
{
	public static void main(String args[])
		{
			NegativeReverse nr= new NegativeReverse();
			int count=nr.calCount(new int[]{10,-3,56,78,24,-7,12,-4,-5,78},0);
			int b[]=nr.copyingNegativeElemenets(new int[]{10,-3,56,78,24,-7,12,-4,-5,78},count);
			nr.reverseArray(b);
			



		}
}


class NegativeReverse
{
	int calCount(int a[],int count)
	{
	
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<0)
			{
				count++;
			}

		}
		return count;

	}



	int[] copyingNegativeElemenets(int a[],int count)
	{
		int b[]=new int[count];
		

		for(int x=0,y=0;x<a.length;x++)
		{
			if(a[x]<=0)
			{
				b[y]=a[x];
				y++;
			}

			
		}

		return b;
	}


		void reverseArray(int b[])
		{
			for(int x=b.length-1;x>=0;x--)
			{
				b[x]=b[x];

				System.out.println(b[x]);
			}
		}
}
	






















