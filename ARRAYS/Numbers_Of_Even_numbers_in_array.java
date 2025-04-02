
//count the number of even numbers in array

import java.util.Random;
class Numbers_Of_Even_numbers_in_array
 {
    public static void main(String[] args)
	 {

		Random r=new Random();
        	int arr[]=new int[10];

		for(int x=0;x<arr.length;x++)
		{
			arr[x]=r.nextInt(1,20);
		}
		
		System.out.println("Array Elements are: ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}

		int count=0;

        	for(int x=0;x<=arr.length-1;x++)
       		 {
            		if(arr[x]%2==0)
            		{
                	count++;
            		}
        	}


		System.out.println("\n no of even numbers in array are : "+count);

   	 }
}


