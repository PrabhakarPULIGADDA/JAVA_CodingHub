//Second Maximum digit

/*
import java.util.Scanner;
class SecondMaxDigit_Array
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of the array: ");
		int length=sc.nextInt();

		System.out.println("Enter the elements: ");

		int arr[]=new int[length];
		a={10,20,3}

		int max=0; int SecondMax=0;
		for(int x=0;x<=arr.length-1;x++)
		{

			arr[x]=sc.nextInt();
	
		 	if (arr[x] > max)
			 {
                		SecondMax = max;
                		max = arr[x]; 
           		 }
			else if (arr[x] < max && arr[x] > SecondMax)
			 {
               			 SecondMax = arr[x]; 
           		 }
		}
			System.out.println("second largest digits is: "+SecondMax);
}
}

*/


class SecondMaxDigit_Array
{
	public static void main(String args[])
	{
		
		SecondMax sm=new SecondMax();
		sm.calSecondMax(new int[]{10,20,34,0,8,125,45});
		sm.Display();

	}
}


class SecondMax
{
	int max=Integer.MIN_VALUE;
	int Second_max=0;
	
	int[] calSecondMax(int a[])
	{
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>max)
			{
				Second_max=max;
				max=a[x];
			}


			else if(a[x]<max && a[x]>Second_max)
			{

				Second_max=a[x];

			}
		}
		return a;
	}

	void Display()
	{
		System.out.println("Second max digit is: "+Second_max);
	}
}



		