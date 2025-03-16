//5-03-2025
//while loop
//WP to print the npr fatorial[n!/(n-r)!]


class NPR
{
	public static void main(String args[])
	{
		int n=5,r=3,nr=n-r;
		int start=1,end=n,n_product=1;
		
		while(start<=end)  
		{
			n_product=n_product*start;
			start++;
		}
			System.out.println("n! is :"+ n_product);
		
			int nr_start=1,nr_end=nr,nr_product=1;
			
			while(nr_start<=nr_end)
			{
				nr_product=nr_product*nr_start;
				nr_start++;

			}

			System.out.println("n-r! is :"+nr_product);

			System.out.println(n+"P"+r+" is "+(n_product/nr_product));
    	}
}


