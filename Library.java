//25-02-2025
//else if ladder

//

class Library
{
  public static void main(String args[])
  {
	double book_price=850.59;
	System.out.println("book Price is : "+book_price);

	int return_day=30;
	System.out.println("book return day: "+return_day);

	if(return_day<=0)
	System.out.println("Invalid inputs");

	else if(return_day<=10)
	
	System.out.println("You need not to pay any money");
	

	else if(return_day<=20)
	System.out.println("you need to pay : "+20*return_day);

	else if(return_day<=45)
	System.out.println("You need to pay book price:"+book_price);

	else

	System.out.println("need to pay"+2*book_price);

}
}


