//5-03-2025
//while loop
//Write a program to print any number table

class Table
	{
		public static void main(String args[])
			{
				int start=1,end=10,table=8;

				while(start<=end) //1<=10t 2<10t 3<=10 4<=10t ........11<10F
				{

 					int product=table*start;//8*1=8 8*2=16 8*3=24 8*4=32 8*5=40.....8*8=64t
					int result=(int)Math.sqrt(product);//2 //4 //4 //5 //6 ...//8
					if(product==result*result)//2==1f 16==4*4t  24==16f 32==5*5f 40==6*6f ....64==8*8t
					{
					System.out.println(table+"*"+start + "="+product); 
					  //8*2=16  8*8=64

 					}
					start++; //2 3 4 5 6 7 8 9 10 11
				}
			}
	}