/* class SecondMinValue
{
	public static void main(String args[])
	{
		int arr[]=new int[]{0,2,5,1,3,0,4};
		
		int Min=9,SecondMin=0;

		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]<Min)
			{
				SecondMin=Min;
				Min=arr[x];
			}
			

			else if (arr[x] > Min && arr[x] < SecondMin)
			 {
               			 SecondMin = arr[x]; 
           	
			 }
		
		}


		System.out.println("the second Min value is: "+SecondMin);


	}
}
*/

class SecondMinValue
{
	public static void main(String args[])
	{
		SecondMin sm=new SecondMin();
		
		sm.calSecondMin(new int[]{10,20,45,562,9,2,5},9);
			
		System.out.println(sm.Display());




	}

}





class SecondMin
{
	int Second_Min=0;
		
	int calSecondMin(int arr[],int Min)
		{
			for(int x=0;x<arr.length;x++)	
			{
				if(arr[x]<Min)
				{
					Second_Min=Min;
					Min=arr[x];
				}


				else if(arr[x]>Min && arr[x] < Second_Min)
				{
					Second_Min=arr[x];
				}

			}
			return Second_Min;
		}


	String Display()
	{
		return "Second_min value is: "+Second_Min;
	}

		
}




