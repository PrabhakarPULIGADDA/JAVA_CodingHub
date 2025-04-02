//Print square root of each element

class SQUARE_ROOT_OF_EACH_ELEMENT_INARRAY
 {
    public static void main(String[] args)
	 {
        	int arr[]=new int[]{1,4,83,12,49,31,43,25,625,43};

		System.out.println("Square root values of give array are: ");
        	for(int x=0;x<arr.length-1;x++)
       		 {
           		int sqrt=(int)Math.sqrt(arr[x]);
                	System.out.println("Square root value of arr["+x+"]="+arr[x]+ "\t"+ sqrt);
        
        	 }
   	 }
}


