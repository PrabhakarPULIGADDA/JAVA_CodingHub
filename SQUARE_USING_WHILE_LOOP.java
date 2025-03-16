//5-03-2025
//while loop
//Write a program to print Square values between 1 to 10

class SQUARE_USING_WHILE_LOOP
{
	public static void main(String args[])
	{
		int start=1,end=10;

		while(start<=end) 
		{ //1<=10t 2<=10t 3<=10t 4<=10t 5<=10t.........11<=10F
 
		 double square=Math.sqrt(start);
		 System.out.println(start+"Square root value is :"+square);
		 start++; //2 3 4 5 6 7 8 9 10 11
                }
    	}
}
