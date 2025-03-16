//25-02-2025
//else if ladder

//WAP to check weather a person is kid or minor or major or senior citizen
class Age_category
{
  public static void main(String args[])
{ 
   int age=19;
     if(age<0)
     System.out.println("Invalid Input");  //THERE IS ONLY ONE OUTPUT STATEMENT IN IF SCOPE SO {} ARE NOT REQUIRED 
     
     else if(age<10)
     System.out.println("Youre a KID");
     
     else if(age<=17)
     System.out.println("Youre a MINOR");

     else if(age<60)
     System.out.println("Youre a MAJOR");

     else if(age<=100)
     System.out.println("You are a SENIOR CITIZEN");
}

}

     