import java.util.Scanner;
class FIBONACCI_USING_RECURSION
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			FIBONACCI cf=new FIBONACCI();
			System.out.print("enter the number: ");
			int n=sc.nextInt();
			cf.calFibonacci(0,1,0,n,1);
		
		}
}



class FIBONACCI
{
	void calFibonacci(int a,int b,int c,int n,int start)
	{
	
		if(n==0 || n==1)
		{
			System.out.println("0");
		}
		
		else if(start>n)
		{
			return;
		}

		else
		{
			System.out.println(a);	
			c=a+b;
			a=b;
			b=c;			
		}
		 calFibonacci(a,b,c,n,start+1);
	}
}