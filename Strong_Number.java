

class Strong_Number {
    public static void main(String[] args) {
        int num=125,temp=num;
        long sum=0l;
        while(num!=0)
        {
            int rem=num%10;
            int start=1;
	    long product=1l;
        

          	 while(start<=rem)
        	{
            	product=product*start;
            	start++;
	  	}
        
	
	   sum=sum+product;
           num=num/10;    
        }
        if(sum==temp)
        System.out.println(temp + " YES");
    
	else
            System.out.println(temp + " NO");
        
    }
}