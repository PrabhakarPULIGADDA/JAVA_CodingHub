//RECURSION == a method calling it self

class Prime_Using_Rescursion
{

		void Prime(int n,int start,int count)
		{
			if(start>n)
			{
				if(count==2)
				System.out.println(n+" is prime");
				
				else
				System.out.println(n+" Is not Prime ");

			
			}
			
			else
			{
				if(n%start==0)
				count++;
				
				Prime(n,start+1,count);
			}
		}
	

	public static void main(String args[])
	{
			
		Prime_Using_Rescursion p=new Prime_Using_Rescursion();
		int arr[]=new int[]{2,3,55,8,9,14};

		p.Prime(5,1,0);//For single element 

		/*for(int t:arr)
		{
			p.Prime(t,1,0);		
		}*/ //for array elements


		/*for(int x=0;x<=arr.length-1;x++)
		{
			p.Prime(arr[x],1,0);
		}*/ //for array elements
			
	}


}
  



















