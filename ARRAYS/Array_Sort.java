
import java.util.Random;
import java.util.Arrays;
class Array_Sort
{
	public static void main(String args[])
		{
			Random random=new Random();
			Array_Sort ar=new Array_Sort();
			int a[]=new int[5];

			int b[]=ar.arrayElements(a);

			System.out.println("ARRAY BEFORE SORTING");
			for(int t:b)
			{
				System.out.println(t);
			}

			System.out.println("ARRAY AFTER SORTING");

			int c[]=ar.arraySort(b);
			for(int t1:c)
			{
				System.out.println(t1);
			}

		}
		
		int[] arrayElements(int a[])
		{
			for(int x=0;x<=a.length-1;x++)
			{
				a[x]=random.nextInt();
			}
			return a;
		}

		int[] arraySort(int a[])
		{
		
			Arrays.sort(a);
			return a;
		}
	
}

	