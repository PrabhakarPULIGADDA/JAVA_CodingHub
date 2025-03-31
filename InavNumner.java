
import java.util.Scanner;
class Inav
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
		}
		num=sum;
		}
		
		if(num==1)
		System.out.println("InavNumber");

		else
		System.out.println("Not InavNumber");


	}
	
}		
		




class InavNumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Inav i=new Inav();
	
		System.out.println("enter the number: ");
		i.num=s.nextInt();

		i.calInav();

	}
}




















		