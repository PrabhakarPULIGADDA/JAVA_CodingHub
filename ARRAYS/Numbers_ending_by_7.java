
//Print nos ending by 7

import java.util.Random;
class Numbers_ending_by_7
 {
    public static void main(String[] args)
	 {

		Random r=new Random();
        	int arr[]=new int[]{1,45,17,34,37,434,577,97};

		/*for(int x=0;x<arr.length;x++)
		{
			arr[x]=r.nextInt(10,100);
		}*/

		System.out.println("Elements ends with 7 are: ");

        	for(int x=0;x<=arr.length-1;x++)
       		 {
            		if(arr[x]%10==7)
            		{
                	System.out.println(arr[x]);
            		}
        	}
   	 }
}


