
import java.util.Scanner;

class Palindrome_Model3
{
	int isPalindrome(int num,int rev)
	{
		while(num>0)
		{
			int res=num%10;
			rev=rev*10+res;
			num/=10;
		}
		
	return rev;
	}



	String checkPalindrome(int rev,int num)
	{
		if(rev==num)
			return num+" IS PALINDROME";

		else
			return num+" IS Not PALINDROME";
	}
}


class Main
{
	public static void main(String args[])
	{
		Palindrome_Model3 p=new Palindrome_Model3();
		Scanner s=new Scanner(System.in);

		System.out.println("enter the number: ");
		int num=s.nextInt();
		int temp=num;

		int result=p.isPalindrome(num,0);
		System.out.println(p.checkPalindrome(result,temp));
	}
}

		