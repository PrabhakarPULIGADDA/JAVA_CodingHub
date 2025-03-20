
import java.util.Scanner;
class Prime_oops
{
	int count,number;
	
	void cal_Factors()
	{	
		int x;
		for(x=2;x<=number/2;x++)
		{
			if(number%x==0)
			{
				count++;
				break;
			}
		}
	}




   void check_P()
	{
		if(count==0 || number==2)
		
			System.out.println(number+" IS PRIME ");
		else
			System.out.println(number+" IS NOT A PRIME ");
	}

}



class Main
{
	public static void main(String args[])
	{
		Prime_oops p=new Prime_oops();	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		p.number=s.nextInt();
		p.cal_Factors();
		p.check_P();
	}
}
