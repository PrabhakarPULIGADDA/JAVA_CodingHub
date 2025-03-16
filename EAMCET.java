class EAMCET
{
	public static void main(String args[])
	{
		int maths=50,physics=50,chemistry=50,max=150;
		int rank=3;
                String caste="OC"; 
                String branch="Engineering";
		int total=maths+physics+chemistry;
		double percentage=(double)total/max*100;

		System.out.println(percentage);

		if(maths<15||physics<15||chemistry<15||percentage<25)
                {
			System.out.println(" YOU ARE DISQUALIFIED...BETTER LUCK NEXT TIME ");
		
		}

       		 // Check if the branch is Engineering
       			 if (branch=="Engineering")) 
 			{
           	             if (caste=="OC") 
				{
                		  if (rank <= 5)
				      {
                                   System.out.println("Allocated to Engineering");
                                      } 
                                  else if(rank<=100) 
				      {
                                      System.out.println("Allocated to Engineering with branches of CIVIL,MECH,EEE");
                                      }
                                 } 
            
			else if (caste.equals("OBC")) 
                        {
                              if(caste=="OBC")
				{
					if(rank<=6)
					   {
					     System.out.println("Allocated to Enineering : CSE,ECE,CIVIL,MECH);
					    }
                                        else 
                                           {
                                             System.out.println(







                  if (rank <= 5) {
                    System.out.println("Allocated to Engineering (OBC).");
                } else {
                    System.out.println("Rank too high for Engineering (OBC).");
                }
            } else if (caste.equals("SC")) {
                if (rank <= 7) {
                    System.out.println("Allocated to Engineering (SC).");
                } else {
                    System.out.println("Rank too high for Engineering (SC).");
                }
            } else if (caste.equals("ST")) {
                if (rank <= 8) {
                    System.out.println("Allocated to Engineering (ST).");
                } else {
                    System.out.println("Rank too high for Engineering (ST).");
                }
            }
        }

                                                                           // Check if the branch is Medical
        if (branch.equals("Medical")) {
            // Allocate seat based on caste for Medical branch
            if (caste.equals("General")) {
                if (rank <= 3) {
                    System.out.println("Allocated to Medical (General).");
                } else {
                    System.out.println("Rank too high for Medical (General).");
                }
            } else if (caste.equals("OBC")) {
                if (rank <= 3) {
                    System.out.println("Allocated to Medical (OBC).");
                } else {
                    System.out.println("Rank too high for Medical (OBC).");
                }
            } else if (caste.equals("SC")) {
                if (rank <= 5) {
                    System.out.println("Allocated to Medical (SC).");
                } else {
                    System.out.println("Rank too high for Medical (SC).");
                }
            } else if (caste.equals("ST")) {
                if (rank <= 6) {
                    System.out.println("Allocated to Medical (ST).");
                } else {
                    System.out.println("Rank too high for Medical (ST).");
                }
            }
        }
    }
}

























	}
}
