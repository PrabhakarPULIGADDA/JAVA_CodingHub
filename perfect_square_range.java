//5-03-2025
//while loop
//Print the perfect square range between 20 to 1

class perfect_square_range
{
 public static void main(String args[])
	{
		int start=20,end=1;
		
		while(start>=end) //20>=1....0>=1F
		{
		int num=start; //1
		int square=(int)Math.sqrt(num); //calculates some value
		
		if(num==square*square) //1==calculated valeT
		{
			System.out.println(num+" PERFECT SQUARE ");
		}
		start--; //19 18 17 16 15 14 13 12..........0
		}
	}
}

//print the leap year between 1800 to 2000
//print if the leap year divisible by 6 in between 1600 and 2000