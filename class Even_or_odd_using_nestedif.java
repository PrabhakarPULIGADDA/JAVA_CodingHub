//25-02-2025
//take month number as input and print the no of days in the month as output by using terinary operator



class Even_or_odd_using_nestedif
{
	public static void main(String args[])
	{
          int num=27;
 
		if(num%2==0)
		{
	          double res=Math.sqrt(num);
			if(res==num*num)
			{
		          	System.out.println(num+" is even and Perfect square ");
                        }
			
                        else
			{
                         	System.out.println(num+" is even and Not a Perfect square ");
        		}
                }

                else
  		{
			int last_digit=num%10; //27 % 10 =7
			
			if(last_digit%5==0)// 7 % 5 = 2
			{
				System.out.println(num + " Odd and didvisible by 5 ");
                        }
			
			else
			{
				System.out.println(num+ " Odd and not didvisible by 5 ");

			}

		}

         }
}
