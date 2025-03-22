
import java.util.Scanner;

public class Range_Cube {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  N: ");
		int n=s.nextInt();
		System.out.println("Enter M: ");
		int m=s.nextInt();
		int sum=0;
		while(n<=m)
		{
		for(;n<=m;n++)
			{
				int pow=(int)Math.pow(n,3);
				sum+=pow;
			}
		
		System.out.println("Sum is: "+sum);
	   }

	}

}
