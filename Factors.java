
import java.util.Scanner;
class Factors
{  
  public static void main(String args[])
	{

		Scanner s=new Scanner(System.in);
		System.out.print("enter the number: ");
		int num=s.nextInt();
		start=1,end=num;
		while(start<=end)
		{
		if(num%start==0)
		{
		System.out.println(start);
		}
		start++;
		
		}
	}
}