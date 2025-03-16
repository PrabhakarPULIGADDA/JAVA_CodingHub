//28-02-2025

//Accept a charceter as input check if it is capital or not 
//=>if it is capital convert it into lower
//=>if it was lower convert it into upper

class Capital
	{
	  public static void main(String args[])

		{
			char ch='D';
		
			if(ch>='A'&& ch<='Z')
			{
           			int lower=ch+32;
   				System.out.println(ch+" is converted to lower case "+ (char) lower);
			}

			else if(ch>='a'&& ch<='z')
			{
           			int upper=ch-32;
   				System.out.println(ch+" is converted to upper case "+ (char) upper);
			}
      
			else
			{
		   		System.out.println(ch+"INVALID CHARACTER");
                        }
    		
		}

	}