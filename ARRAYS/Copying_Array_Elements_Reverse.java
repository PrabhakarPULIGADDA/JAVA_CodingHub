
//26-03-2025
/*a={10,20,30,40,50}
  b={ }  */


//copying in reverse order

class Copying_Array_Elements_Reverse
{
 	public static void main(String args[])
	{
		int a[]={10,20,30};
		
		int b[]=new int[a.length];
		
		int y=0;
		for(int x=b.length-1;x>=0;x--,y++)
		{
			b[y]=a[x];
		}

		System.out.println("The Reversed array is: ");

		for(int x=0;x<=b.length-1;x++)
		{
			System.out.println(b[x]);
		}
	}
}
