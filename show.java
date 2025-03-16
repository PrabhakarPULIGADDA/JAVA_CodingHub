class show
{
	public static void main(String args[])
	{
		int num=123,sum=0,reversed=0,total=0;

		while(num!=0)
		{
		  int res=num%10;
		  sum=sum+res;
		  num=num/10;
		  reversed=reversed*10+res;
		
		}
		System.out.println(sum+"sum");
		System.out.println(reversed+"reverse");
		while(reversed!=0)
		{
      		int res2=(int)reversed%10;
	        total=(int)sum/res2;
		reversed=reversed/10;
		System.out.println(total);
		}
      }
}