//Print all 2 digit number from an array


class TWO_digit_number_printing
 {
    public static void main(String[] args)
	 {
        	int arr[]=new int[]{12,34,5,7,23,52,6,90,23,21,6,-1,-45,3};
        	for(int x=0;x<arr.length-1;x++)
       		 {
            		if(arr[x]>9&&arr[x]<99)
            		{
                	System.out.println(arr[x]);
            		}
        	}
   	 }
}