class TCS {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }


        int num = Integer.parseInt(args[0]);
        
      int start=1,end=num,count=0;
      
      
      
      
      while(start<=end)
      {
        if(num%start==0)
        {
          count++;
        }
        start++;
      }
      System.out.println(count);
      if(count==2)
      {
        Double square=Math.sqrt(num);
       
        System.out.printf("The given number is Prime hence its square is: %.2f\n", square);
      }
      else
      {
        System.out.println("the given number is not a prime so the result is : 0.00");
      }
  }
}