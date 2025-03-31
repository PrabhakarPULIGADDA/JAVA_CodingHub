// INPUT: 10,20,30,40,50
//OUTPUT:30,40,60,80,90

/*
class Pre_Next_Sum
{
	public static void main(String args[])
	{
		int a[]= new int[]{1,0,4,-2,-3};
		int b[]=new int[a.length];
		
		for(int x=0;x<a.length;x++)
		{

			if(x==0)
			{
				b[x]=a[x]+a[x+1];
			}
			else if(x==a.length-1)
			{
				b[x]=a[x]+a[x-1];
			}
			else
			{
				b[x]=a[x+1]+a[x-1];
			}
				
			System.out.println(b[x]);	
		}
	}
}

*/


class Pre_Next_Sum
{
	public static void main(String args[])
		{
			PrenextSum ps=new PrenextSum();
			int b[]=ps.calSumdigit(new int[]{10,20,30,40,50});
			ps.Display(b);
				

		

		}
}

class PrenextSum
{
	int[] calSumdigit(int a[])
	{

		int b[]= new int[a.length];
		for(int x=0;x<a.length;x++)
		{

			if(x==0)
			{
				b[x]=a[x]+a[x+1];
			}
			else if(x==a.length-1)
			{
				b[x]=a[x]+a[x-1];
			}
			else
			{
				b[x]=a[x+1]+a[x-1];
			}	
		}
	return b;
	}

	void Display(int b[])
	{
		for(int x=0;x<b.length;x++)
			{
				System.out.print(b[x]+" ");
			}
	}
}
		

































