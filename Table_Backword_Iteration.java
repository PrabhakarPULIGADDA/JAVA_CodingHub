//5-03-2025
//while loop
//Write a program to print any number table in BACKWORD ITERATION
 

class Table_Backword_Iteration
{
	public static void main(String args[])
		{
			int start=10,end=1,table=8;
			
			while(start>=end) //10>=1t 9>=1t .........1>=1t 0>=1F
			{
				System.out.println(table+"*"+start+"="+table*start); //20 18.........2
				start--; //9 8 ........0
			} 
		}
}
