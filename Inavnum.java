
import java.util.Scanner;
class InavNumner
{

	int num;
	void calInav()
	{
		
		while(num>9)
		{
		int sum=0;
			while(num>0)
			{
			int res=num%10;
			sum+=res;
			num/=10;
			System.out.println(sum);
			}
		num=sum;
		}
		
	}


	void Display()
	{
		if(num==1)
		System.out.println("InavNumber");

		else
		System.out.println("Not InavNumber");
	}

		
	
}		
		




class InavMain
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		InavNumner i=new InavNumner();
	
		System.out.println("enter the number: ");
		i.num=s.nextInt();

		i.calInav();
		i.Display();

	}
}




















		