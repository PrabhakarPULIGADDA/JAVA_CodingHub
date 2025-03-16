class Happy{
    public static void main(String[] args) {
        int num=12,temp=num;
        while(num!=0&&num!=4)
        {
		int sum=0;
		while(num>0)
		{
            int res=num%10;
            int square=(int)Math.pow(res,2);
            sum=sum+square;
	    num/=10;
		}
		
            num=sum;
        }
	System.out.println(num==1?"Happy number":"Not a happy number");
        }
}



