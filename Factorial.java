class Factorial
	{
		public static void main(String args[])
			{
				int start=1,end=5,r=3,n=1,res=1;
					
					while(start<=end)
						{
							n=n*start;
						
							start++;
						}
					System.out.println("n! = "+n);

						int nr = end - r;
        				while(nr > 0) 
						{
            					    res=res* nr;
            					    nr--;
						}
					
					System.out.println("(n-r)! = "+ res);


					System.out.println("npr result is :" + n/res );

						
			}
	}