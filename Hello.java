import java.util.Scanner;

class Palindrome_Prime
{
  public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int reverse=0,temp=num,count=0,strat=1;
		
			do
			{
			if(num%start==0)
			{
				count++;
			}
			strat++;
			}
			while(start<=num);
			
			do
			{
			int rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
			}
			while(temp!=0);
			
			if(reverse==temp&&count==2)
			System.out.println("PALINDROME Prime");
			else
			System.out.pritln("NOT A PALINDROME Prime");		







	}
}