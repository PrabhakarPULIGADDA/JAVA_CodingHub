//5-03-2025
//while loop
//Write a program to print any number table

class Table_even_odd
	{
		public static void main(String args[])
			{
				int start=1,end=10,table=8;

				while(start<=end)
				{

 					int product=table*start;
					if(start%2==0)
					System.out.println(table+"*"+start + "="+product);  
					start++;
				}
			}
	}