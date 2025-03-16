class Greater
{
      public static void main(String args[])
       {
		int num1=10;
		int num2=10;
                String S1="they are equal";
                String S2=((num1>num2)?(num1+"is greater" ):(num2+"is greater"));

	        String res=(num1==num2)?S1:S2;

                System.out.println(res);
       }
	
}