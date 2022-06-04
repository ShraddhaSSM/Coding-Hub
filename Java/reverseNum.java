import java.util.*;
class reverseNum
{
  public static void main(String args[])
   {
    int num, reversed = 0;
    System.out.println("Enter number: ");
    Scanner s=new Scanner(System.in);
    num=s.nextInt();
    System.out.println("Original Number: " + num);
    while(num != 0) 
    {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }
    System.out.println("..Reversion..");
    System.out.println("Reversed Number: " + reversed);
    }
}