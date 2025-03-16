//5-03-2025
//while loop
//Write a program to print Perfect squares between 1 to 100

class Perfect_square_while_loop
{
	public static void main(String args[])
	{
		int start=1,end=100;
		
		while(start<=100) //1<=100t.....101<=100F
		{
		int num=start; //1 
		int square=(int)Math.sqrt(num); //calculates square value
		
		if(num==square*square) //1==1*1
		{
		System.out.println(start+"PERFECT SQUARE");
		}
		start++; //2 3 4.....101
		}
	}
}