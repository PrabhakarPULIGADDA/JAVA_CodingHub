//25-02-2025

class Age_catergory_using_nestedif
{	
	public static void main(String args[])
	{
		int age=65;
   		
		if(age>=60)
		{
			String gender="Male";
 			
			if(gender=="FeMale")
			System.out.println("Your gender is  " +gender+" So you'll get a Retirement amount of 30,000");
              
			else if(gender=="Male")
			System.out.println("Your gender is  " +gender+" So you'll get a Retirement amount of 35,000");
       
			else
			System.out.println("Your gender is  " +gender+" So you'll not get any amont");
 		}
 
		else if(age>=18)
		{
			String qualification="UG";
                
               		if(qualification=="UG")
			System.out.println("Your qualification is : " +qualification+" So you'll get a Scolarship amount of 30,000");

			else if(qualification=="PG")
			System.out.println("Your qualification is : " +qualification+" So you'll get a Scolarship amount of 40,000");
			
  			else
			System.out.println("Your qualification is : " +qualification+" So you'll get a Scolarship amount of 20,000");
		}

		else
		{
			System.out.println("Since you're not get Retirement or Scolarship Because your a MINOR");
                }

	}
}
			
			
				