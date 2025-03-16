class tribonacci_for
{
    public static void main(String args[])
    {
        int start=3,n=17;
        for(int a=0,b=1,c=1,d=0;start<=n;start++)
        {
            d=a+b+c;
            a=b;
            b=c;
            c=d;
          System.out.println(start+")"+d);
        }
}
}