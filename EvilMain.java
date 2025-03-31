import java.util.Scanner;

class Evil
{
	int num,sum,square,res;
	
	void issquare()
	{

	square=(int)Math.pow(num,2);

	}

	void calSum()
	{

	while(square!=0)
	{
		int res=square%10;
		sum+=res;
		square/=10;
	}
	
	}

	void Display()
	{
		if(sum==num)
		System.out.println(num+" Is Evil Number");

		else
		System.out.println(num+" Is not Evil number");

        }
}

class EvilNumber
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Evil e=new Evil();
e.sum=0;
e.square=0;
e.res=0;
System.out.println("enter the number: ");
e.num=s.nextInt();
e.issquare();
e.calSum();
e.Display();
}
}














