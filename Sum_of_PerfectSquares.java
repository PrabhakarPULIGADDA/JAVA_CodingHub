//5-03-2025
//Print the sum of perfect squares between 1 to 100
 class Sum_of_PerfectSquares
   {
	public static void main(String args[])
	 {
		int num=10;
                int start=1,end=num,sum=0;
         
  		while(start<=end)
		{
		  num=start;
		int result=(int)(Math.sqrt(num));
		if(result*result==num)
		{
		 sum+=start;
		System.out.println(num);
                }
		start++;
		}
		System.out.println("sum of the perfect squares between"+num+end+"is:"+sum);
	}
}