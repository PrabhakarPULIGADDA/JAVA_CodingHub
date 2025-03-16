//5-03-2025
//Print the noof perfect squares between 1 to 100

//	HERE THEY WANT NUMBER OF SO WILL USE **COUNT**

class Number_of_PerfectSquares
{
 public static void main(String args[])
  {
		int num=500;
 		int start=1,end=num,count=0;
  
                while(start<=end)
		{
		num=start;
		
		int Square=(int)(Math.sqrt(num));
		if(Square*Square==num)
		{
			count++;
			System.out.println(Square);
		}
		start++;
		}
               System.out.println("Number of Perfect squares is:"+count);
  }
}