class Age_catergory_using_terinaryoperators
{	
	public static void main(String args[])
	{
		int age=61;
		String gender="male";
		String qualification="UG";
   		
		String result=(age>=60 ?gender=="female" ? gender+" Senior citizen You will get 30000 retirement amount": gender+" senior citizen You will get a 35000 retirement amount" : age>=18 ? qualification=="UG" ? "Your UG you will scolarship of 30000" : qualification=="PG" ? "Your UG you will get scolarship of 			30000":"Youll get scholar ship of 200000":"You will not get any amount because youre a minor");
          	
		System.out.println(result);
       		
	}
}