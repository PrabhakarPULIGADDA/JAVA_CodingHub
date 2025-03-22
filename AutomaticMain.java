

import java.util.Scanner;

class AutomaticNumber
{

	int num,square,count,squaretemp;


	int calSquare()
	{
	
	square=num*num;

	return square;

	}

	void  calCount(int num)
	{
		while(num!=0)
		{
			int res=num%10;
			count++;
			num/=10;
		}
	
		
	}


	void checkAutomatic()
	{

		int divider=(int)Math.pow(10,(count));
		
		
		System.out.println(square);		

		int lastPart=square%divider;
	

		if(lastPart==num)
		System.out.println("Automatic Number");

		else
		System.out.println("Not Automatic Number");
	}

}



class AutomaticMain
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	AutomaticNumber an=new AutomaticNumber();

	System.out.println("enter the number: ");
	an.num=s.nextInt();
	an.squaretemp=an.num;
	an.square=0;
	an.count=0;
	an.squaretemp=0;
	
	int res=an.calSquare();
	an.calCount(an.num);
	an.checkAutomatic();
}
}












			


	
	