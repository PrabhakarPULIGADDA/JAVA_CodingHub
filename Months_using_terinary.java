//25-02-2025
//take month number as input and print the no of days in the month as output by using terinary operator



class Months_using_terinary
{
	public static void main(String args[])
	{
	
	int month=12;

	System.out.println((month==1||month==3||month==5||month==7||month==8||month==10||month==12) ? month+" 31 days " : (month==4||month==6||month==9||month==12) ? month+ " 30 days " : (month==2)? month+" 28/29 days " : month + " Invalid input ");
 	
	}
}