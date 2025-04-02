import java.util.Scanner;

class Element_Insert_Into_Particular_Place
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);	
		int arr[]=new int[5];

		System.out.println("Enter the array elements: ");
		
		for(int x=0;x<=arr.length-2;x++)
		{
			arr[x]=sc.nextInt();
		}

		

		System.out.println("Enter the element you want to insert: ");
		int element=sc.nextInt();

		System.out.println("Enter the index in which you want to place element: ");
		int index=sc.nextInt();

		if(index<0 || index>arr.length)
		{
		
			System.out.println("not able to insertr");
		}


		else
		{
 		int temp=arr[arr.length-2];
		for(int i=arr.length-1;i>index;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[index]=element;




		System.out.println("array after inserting: ");

		for(int t:arr)
		{
			System.out.println(t);
		}

		}
}
}
		





			