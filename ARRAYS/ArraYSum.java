
import java.util.Scanner;
class ArraYSum
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    int sum=0;
    System.out.println("enter array elements: ");
    for(int x=0;x<=arr.length-1;x++)
    {
        arr[x]=sc.nextInt();
        sum+=arr[x];
    }
    
    System.out.println("The elements sum  is: "+ sum);
    }
}