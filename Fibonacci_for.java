class Fibonacci_for
{
    public static void main(String args[])
    {
        int start=2,n=17;
        for(int a=0,b=1,c=0;start<=n;start++)
        {
            c=a+b;
            a=b;
            b=c;
          System.out.println(start+")"+c);
        }
}
}