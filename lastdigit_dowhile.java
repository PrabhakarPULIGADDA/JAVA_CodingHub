

class lastdigit_dowhile{
    public static void main(String[] args) {
        int num=1254;
      do
      {
          int res=num%10;
          System.out.println(res);
          num=num/10;
      }
      while(num!=0);
        
    }
}