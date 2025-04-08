class PALINDROME_USING_RECIRSION
{
	String checkPalindrome(int n,int rev,int temp)
	{
		
		if(n==0)
		{
			if(temp==rev)
				return temp+ "is plandrome";

			else
				return " ";
		}

		else
		{
			int res=n%10;
			rev=rev*10+res;
			n/=10;
		
			return checkPalindrome(n,rev,temp);
		}
	}


		public static void main(String args[])
		{
		
			PALINDROME_USING_RECIRSION palindrome=new PALINDROME_USING_RECIRSION();
			//System.out.println(palindrome.checkPalindrome(121,0,121));

			int arr[]=new int[]{101,34,567,121,9,787,45654};

			for(int x=0;x<=arr.length-1;x++)//for array elements
			{

				System.out.println(palindrome.checkPalindrome(arr[x],0,arr[x]));

			}

		}
}