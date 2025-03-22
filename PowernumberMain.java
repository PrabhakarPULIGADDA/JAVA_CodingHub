import java.util.Scanner;


class PowerNumber
{
	int sum, product=1;
	void calPowerNumber(int num)
	{
		while(num!=0)
		{
			int res=num%10;
			sum+=res;
			product*=res;
			num/=10;

		}
	

	}

	

}

class PowernumberMain
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
PowerNumber p=new PowerNumber();
System.out.println("Enter thr number: ");
int n=sc.nextInt();
p.calPowerNumber(n);
		if(p.sum==p.product)
		System.out.println("Power Number");

		else
		System.out.println("Not Power Number");
}
}