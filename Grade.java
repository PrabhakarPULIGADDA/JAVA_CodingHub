//25-02-2025
//else if ladder

//based on percentage allocate grade

class Grade
{
  public static void main(String args[])
{
 int m1=30,m2=30,m3=30,m4=30,m5=3,max=150;
 int total=m1+m2+m3+m4+m5;
 

System.out.println("Your total marks are : "+total);
double Percentage =((double)total/max)*100;
System.out.println("Your Percentage is : "+Percentage);

if (m1<15 ||m2<15||m3<15||m4<15||m5<15)
System.out.println("You are failed in m1");


else if (Percentage<35)
System.out.println(" You are Failed ");

else if (Percentage<=50)
System.out.println(" You are Passed with grade of D ");

else if (Percentage<=60)
System.out.println(" You are Passed with grade of C");

else if (Percentage<=75)
System.out.println(" You are Passed with grade of B");

else if (Percentage<=100)
System.out.println(" You are Passed with grade of A");


}
}