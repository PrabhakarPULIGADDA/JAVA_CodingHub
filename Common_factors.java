class Common_factors
{
  public static void main(String args[])
	{
           int n1=6,n2=12,start=1,end=n1/2;
		while(start<=end)
		{
		String a=n1%start==0?start:"";
		System.out.println(a);
		String b=n2%start==0?start:"";
		System.out.println(b);
		}
	}
}