import java.util.Scanner;
class Perfect_number
{  
  public static void main(String args[])
	{
		
		for(int x=1;x<=10000;x++)
		{

			int start=1,end=x,sum=0;
			while(start<end)
			{
				if(x%start==0)
				{
					sum+=start;
									
				}
			start++;
		
			}
			if(sum==x)
			System.out.println(x+"is a Perfect number");
			

		}





	}
}