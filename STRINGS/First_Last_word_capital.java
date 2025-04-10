import java.util.Scanner;
class First_Last_word_capital
{
	public static void main(String args[])
		{
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the String: ");

		String s=sc.nextLine();
		
		String arr[]=s.split(" ");
		
		String res="";

		for(int x=0;x<=arr.length-1;x++)
		{
			String word=arr[x];
			if(x==0||x==arr.length-1)
			{
				res=res+word.toUpperCase()+" ";
			}
			else
			res=res+word.toLowerCase()+" ";
		}	

		System.out.println("Strinf after first&last word capitalization"+ res);
		
	}
}
		
		