
import java.util.Scanner;
class Palindrome_do_while
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int temp=num,reverse=0;
		do
		{
		int res=num%10;
		reverse=reverse*10+res;
		num=num/10;
		}
		while(num!=0);
		System.out.println("reverse is :"+reverse);
		
		if(temp==reverse)
		System.out.println(temp+"PALINDROME");
		else
		System.out.println(temp+"NOT A PALINDROME");
	}
	
}
