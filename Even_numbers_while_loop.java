//5-03-2025
//while loop
//Write a program to print even and odd numbers  between 1 to 100 [SEPARATE]

class Even_numbers_odd_numbers_while_loop
{
	public static void main(String args[])
	{
		int start=1,end=100,temp=start;
		
		while(start<=end) //1<=100t 2<=100t 3<=100t....101<=100f
		{
			int num=start; //1 2 3
			if(num % 2==0) //1%2=1 2%2=0 3%2=1.......100%2=0
			{
			System.out.println(num);
			}			
			start++; //2 3.......101
		}

                while(temp<=end) //1<=100T.................101<=101F
		{
			
			if(temp%2!=0) //1%2=1T 2%2=0f 3%2=1T......97%2=1T 99%2=1T 100%2=0F 
			{
                       
			System.out.println(temp);
			}
			temp++; //2 3 4 5.............101

		}
	}
}