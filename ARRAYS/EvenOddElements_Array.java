//26-03-2025
//1st print even elements then odd elements


import java.util.Scanner;
class EvenOddElements_Array
{
	public static void main(String args[])
	{

		Scanner s=new Scanner(System.in);

		int a[]={10,7,9,3,6};
		int b[]=new int[a.length];

		int y=0;
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]%2==0)
			{

				b[y]=a[x];
				y++;
			}
		}

		

	
		for(int x=0;x<=b.length-1;x++)
		{
			if(a[x]%2!=0)
			{
				
				b[y]=a[x];
				y++;
			}
		}




		for(int x=0;x<=b.length-1;x++)
		{
			System.out.println("arr["+x+"]="+b[x]);
		}

	}
}
















		

	