class LeapYear
	{
	   public static void main(String args[])
		{
			int start=2000,end=2026;
			while(start<=end)
			{
				System.out.print(start%4==0 && start%100!=0 || start%400==0?start+"\t":"");
                                start++;
			}
		}
	}