class GCD
{
    public static void main(String args[])
    {
        int num1=10,num2=20,start=1,max=0;
        
        while(start<=num1&&start<=num2)
        {
            if(num1%start==0&&num2%start==0)
            {
                
                max=start;
            }
            start++;
        }
        System.out.println("GCD :"+max);
        }
}