class LEFT_ROTATION
{
	public static void main(String args[])
	{
		int a[]=new int[]{10,20,30,40,50};
		
		int rotations=3;

		for(int r=1;r<=rotations;r++)
		{
		int temp=a[0];
		for(int y=0;y<=a.length-2;y++)
		{
			a[y]=a[y+1];
		}
	
		a[a.length-1]=temp;

		
			
		System.out.println("\n\nrotation"+ r);
		for(int t:a)
		System.out.print(t+" ");

		}
	}
}