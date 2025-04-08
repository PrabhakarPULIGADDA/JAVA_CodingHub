class Static_and_Instance_Blocks
{
	String static name;
	int shop_number;
	
	static
	{
		name="KLM";
		System.out.println("Static block and the name is: "+name);
	}

	{
		shop_number=101;
		System.out.println("instance block elements is: "+shop_number);
	}

	
	Static_and_Instance_Blocks
	{
		System.out.println("constructor"+shop_number);
	}
	


	public static void main(String args[])
	{
		System.out.println("name of the static is: "+name);
		
		Static_and_Instance_Blocks sc1= new Static_and_Instance_Blocks();
		sc.Static_and_Instance_Blocks();
		
		Static_and_Instance_Blocks sc2= new Static_and_Instance_Blocks();
		sc2.shop_number=528;
		sc2.Static_and_Instance_Blocks();
	}
}

	
		
	
		

