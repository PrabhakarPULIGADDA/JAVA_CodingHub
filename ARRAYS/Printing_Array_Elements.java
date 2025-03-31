
class Printing_Array_Elements
{
    public static void main(String[] args)
 	{
            int a[]=new int[]{10,20,30,40,45,56,45};

            //since array containing multiple values so for printting we need at least one loop
           
		 System.out.println("Array elements are: ");

           	 for(int x=0;x<a.length;x++)
           	 {
                	System.out.println(a[x]+" ");
            	 }
    }
}