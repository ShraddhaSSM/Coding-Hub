import java.util.*;
class Banking
{
  public static void main(String args[])
  {
    System.out.println("Welcome to uue bank service");
      System.out.println("....Banking....");
      int a,b,c;
      int sum=0;
      System.out.println("Your current balance is : 8000");
      System.out.println("Enter amount to deposit : ");
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      sum=8000+a;
      System.out.println("Total balance is : "+sum);
      System.out.println("Enter amount to be debited :");
      b=s.nextInt();
      c=sum-b;
      System.out.println("Taotal amount : "+c);
      System.out.println("Thank you");
      ///////////////////////
  }
}