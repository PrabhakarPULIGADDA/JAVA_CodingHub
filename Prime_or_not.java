class Prime_or_not
{
 	public static void main(String args[])
	{
         
         int num=3,start=1,end=num,count=0;
		while(start<=end)
		{
		  if(num%start==0)
			{
				count++;
				System.out.println(start);

     			}
		start++;
			}
	if(count==2)
	System.out.println("Prime");
	else
	System.out.println("Not Prime");
       
       }
}
