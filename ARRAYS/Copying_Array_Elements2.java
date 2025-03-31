//26-03-2025
/*a={10,20,30,40,50}
  b={60,70,80}
  c={10,20,30,40,50,60,70,80} */

import java.util.Scanner;

class Copying_Array_Elements2
{
	public static void main(String args[])
	{
		int a[]={10,20};

		int b[]={30};

		int length=(a.length+b.length);//2+1=3   10 20 30 
		int c[]=new int[length];
	
		int y=0;

		for(int x=0;x<=a.length-1;x++)//0<=1//1<=1
		{
			c[y]=a[x];//c[0]=10//c[1]=20
			y++;//1//2
		}

		for(int z=0;z<=b.length-1;z++)////0<=2//1<=2
		{
			c[y]=b[z];
			y++;
		}

		for(int x=0;x<=c.length-1;x++)
		{
		
			System.out.println(c[x]);
			
		}

	
	}
}
