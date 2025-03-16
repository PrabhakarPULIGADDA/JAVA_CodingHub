//5-03-2025
//Print the perfect squares between 1 to 100

class PerfectSquares_between_1to100
{
	public static void main(String args[])
		{
			int num=100;
			int start=1,end=100;
			while(start<=end)
			{
                          num=start;
			  int result=(int)(Math.sqrt(num));
			  if(result*result==num)
				{
				  System.out.println(num+"Perfect Square");
				}
			start++;
			}
		}
}
		