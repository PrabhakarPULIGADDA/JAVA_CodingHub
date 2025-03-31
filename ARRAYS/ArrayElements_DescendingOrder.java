// Print the elements of an array in descending order
class ArrayElements_DescendingOrder
 {
    public static void main(String args[])
	 {
        	Sorting as = new Sorting();  
        	int arr[] = new int[]{45, 67, 23, 1,97, 45, 128, 97};

        	int a[] = as.SortElements(arr);

        	System.out.println("Array elements after DESCENDING order: ");
        	for (int x = 0; x < a.length; x++) {  
            	System.out.println(a[x]);
		}

		for(int x=0;x<=a.length-1;x++)
		{
		if(a[x]!=a[0])
		{
			System.out.println("Second largest is: "+a[x]);
			break;
		}
		}
    }
}



class Sorting
 {
    int[] SortElements(int arr[]) 
	{
        for (int x = 0; x <= arr.length - 2; x++) 
	{
            for (int i = x + 1; i <=arr.length-1; i++) 
		{  
                	if (arr[x] < arr[i])
			 { 
                    		int temp = arr[x];
                   		arr[x] = arr[i];
                    		arr[i] = temp;
                	 }
           	 }

        }
        return arr;
    }
}
