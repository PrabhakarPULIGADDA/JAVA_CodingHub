import java.util.Scanner;

class PrimeEfficient
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=s.nextInt();
                 int count=0;
		for(int start=1;start<=num/2;start++)
		{
			if(start%2==0)
			{
				count++;
				break;
			}
		}
	System.out.println(count==0&&num>=2?num+" is a Prime":num+" is not Prime");
	}
}	