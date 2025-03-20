
import java.util.Scanner;


public class PrimeSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=s.nextInt();
		 int sum=0;
		 for(int x=2;x<=n;x++)
		 {
			 int count=0;
			 int num=x;
			 for(int start=2;start<=x/2;start++)
			 {
				 if(num%start==0)
				 {
					 count++;
					 break;
				 } 
			 }
			 if(count==0 || x==2)
			 {
				 System.out.print(num+" ");
				 sum+=num; 
			 }
		 }
		 System.out.println("sum is: "+sum);
	}

}
