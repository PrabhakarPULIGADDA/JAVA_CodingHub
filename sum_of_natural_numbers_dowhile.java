

class sum_of_natural_numbers_dowhile{
    public static void main(String[] args) {
        int sum=0,start=1,end=10;
       do
       {
         sum+=start;
         start++;
       }
       while(start<=end);
       System.out.println(sum);
    }
}