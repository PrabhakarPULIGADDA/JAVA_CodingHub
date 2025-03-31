

import java.util.Scanner;
class ArraYReverse
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("enter array elements: ");
    for(int x=0;x<=arr.length-1;x++)
    {
        arr[x]=sc.nextInt();
    }
    
    System.out.println("The reversed array is: ");
    
    for(int x=arr.length-1;x>=0;x--)
    {
        System.out.print(arr[x]+ " ");
    }
    

    }
}