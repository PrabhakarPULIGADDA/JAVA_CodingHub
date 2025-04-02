
//find the product of even numbers in the array

import java.util.Random;
class Product_Of_Even_Numbers
 {
    public static void main(String[] args)
	 {

		Random r=new Random();
        	int arr[]=new int[]{1,45,17,34,37,434,577,97};

		for(int x=0;x<arr.length;x++)
		{
			arr[x]=r.nextInt(1,100);
		
		}

		System.out.println("Array Elements are: ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}

		int product=1;

        	for(int x=0;x<=arr.length-1;x++)
       		 {
            		if(arr[x]%2==0)
            		{
                	product*=arr[x];
            		}
        	 }
		
		 System.out.println("\n Product of even numbers in array are: "+product);


   	 }
}


