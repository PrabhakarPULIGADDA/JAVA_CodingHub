//25-02-2025
//else if ladder

//accept month number as input print the no of days in the month

//31- 1,3,5,7,8,10,12
//30-4,6,9,12
//28-2

class Month
{
  public static void main(String args[])
{
 int month=3;

  if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 )
  System.out.println(month+" Have 31 days ");
  

  else if(month==4 || month==6 || month==9 || month==12 )
  System.out.println(month+" Have 30 days ");
 
  else
  System.out.println(month+" Have 28/29 days");
}
}