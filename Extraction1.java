class Extraction1
{
  public static void main(String args[])
	{
  int num=123400,count=0,temp=num,sum=0,rem=0,count1=0,count2=0,reverse1=0,reverse2=0;
      		while(num!=0)
     		{
	           rem=num%10;
                   count1++;
	           reverse1=reverse1*10+rem;
	           num=num/10;
	        }
                System.out.println(temp+"after reversing:"+reverse1);
		temp=reverse1;

	   
		while(reverse1!=0)
		{
                 rem=reverse1%10;
                 count2++;
		reverse2=reverse2*10+rem;
		reverse1=reverse1/10;
		}
                 
                System.out.println("after re reversing: "+reverse2);

		if(count1==count2)
                 {
		   System.out.println(temp+" is same as "+reverse2);
		 }
		
		 else
                 {
                  int power=(int)Math.pow(10,count1-count2);
		  
		  System.out.println("after adding 0's:"+reverse2*power);
		  }


}
}		