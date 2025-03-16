class SumProd
{
public static void main(String args[])
{
 int start=1,end=10,sum=0,prod=1,temp=start;

while(start<=end)
{
sum=sum+start;
prod=prod*start;
start++;
}
System.out.println(sum);
System.out.println(prod);
}
}