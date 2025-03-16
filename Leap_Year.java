class Leap_Year
{
 public static void main(String args[])
		{
			int year=2024;
                 if(year%4==0 && year % 400 ==0 || year % 100!=0)
                 System.out.println(year + " LEAP YEAR ");

		 else
		 System.out.println(year+ "NOT A LEAP YEAR");
		
		}
}
