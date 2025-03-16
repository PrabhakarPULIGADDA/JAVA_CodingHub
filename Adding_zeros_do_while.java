
import java.util.Scanner;

class Adding_zeros_do_while
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println("Enter number: "+num);

		int reversed=0,result=0,count1=0,count2=0,count=0;
		
		do
		{
		int res=num%10;
		count1++;
		reversed=reversed*10+res;
		num=num/10;
		}
		while(num!=0);


		do
		{
		result=reversed%10;
 		
		switch(result)
		  {
			case 0:
			System.out.println("zero");
			break;	

                        case 1:
    			System.out.println("ONE");
    			break;

  			case 2:
    			System.out.println("TWO");
    			break;

  			case 3:
    			System.out.println("THREE");
    			break;

  			case 4:
    			System.out.println("FOUR");
    			break;


    			case 5:
    			System.out.println("FIVE");
    			break;

  			case 6:
    			System.out.println("SIX");
    			break;

  			case 7:
    			System.out.println("SEVEN");
    			break;

			case 8:
    			System.out.println("EIGHT");
    			break;

  			case 9:
    			System.out.println("NINE");
    			break;

  			
		}
		count2++;
		reversed=reversed/10;
		}
		while(reversed!=0);
		
		count=count1-count2;
		do
		{
		
		count--;
		System.out.println("zero");
		}
		while(count!=0);
              

	}
}
			