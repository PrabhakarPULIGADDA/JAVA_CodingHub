class Extraction2
{
  public static void main(String args[])
	{
  int num=32100,count=0,temp=num,sum=0,rem=0,count1=0,count2=0,reverse1=0,reverse2=0;
      		while(num!=0)
     		{
	           rem=num%10;
                   count1++;
	           reverse1=reverse1*10+rem;
	           num=num/10;
	        }
                System.out.println(temp+"after reversing:"+reverse1);
		temp=reverse1;

	   
		while(reverse1!=0)
		{
                 rem=reverse1%10;

		 switch(rem)
		  {
			case 0:
			System.out.println("zero");
			break;	

                        case 1:
    			System.out.println("ONE");
    			break;

  			case 2:
    			System.out.println("TWO");
    			break;

  			case 3:
    			System.out.println("THREE");
    			break;

  			case 4:
    			System.out.println("FOUR");
    			break;


    			case 5:
    			System.out.println("FIVE");
    			break;

  			case 6:
    			System.out.println("SIX");
    			break;

  			case 7:
    			System.out.println("SEVEN");
    			break;

			case 8:
    			System.out.println("EIGHT");
    			break;

  			case 9:
    			System.out.println("NINE");
    			break;

  			
		}
		
                 count2++;
		reverse2=reverse2*10+rem;
		reverse1=reverse1/10;
		}
                 
		count=count1-count2;
		while(count!=0)
		{
		System.out.println("ZERO");
		count--;
		}


}
}		