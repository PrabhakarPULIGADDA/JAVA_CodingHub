import java.util.Scanner;
class Array_Basic2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the length: ");
		int size=sc.nextInt();

		int arr[]=new int[size];

		int length=arr.length;
		System.out.println("Enter the elements: ");

		for(int x=0;x<=length-1;x++)
		{
			arr[x]=sc.nextInt();
		}
		
		System.out.println("Elements in the array are: ");		

		for(int x=0;x<=length-1;x++)
		{
			System.out.println(arr[x]);
		}
	}
}