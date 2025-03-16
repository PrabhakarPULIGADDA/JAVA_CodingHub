class sum_of_natural_numbers_while {
    public static void main(String[] args) {
       int start=1,end=10,sum=0;
       while(start<=end)
       {
           sum+=start;
           start++;
       }
       System.out.println("sum of natural numbers :"+sum);
    }
}