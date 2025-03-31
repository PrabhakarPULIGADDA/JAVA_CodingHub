//Swapp the arrays

class Swapping_Arrays
{
	public static void main(String args[])
		{
			int a[]={1,2,3,4,5};
			int b[]={6,7,8,9,10};
			int c[]=new int[a.length];
		if(a.length==b.length)
		{
			
			for(int x=0;x<a.length;x++)
			{
				c[x]=a[x];
				a[x]=b[x];
				b[x]=c[x];
			}
		}
			
			System.out.println("a array after swapping: ");
			for(int x=0;x<=a.length-1;x++)
			{
				System.out.println(a[x]);
			}
			
			System.out.println("b array after swapping: ");
			

			for(int x=0;x<=b.length-1;x++)
			{
				System.out.println(b[x]);
			}
		
			
		}
}
			