import java.util.*;
class factors
{

  public static void main(String[] args)
   {
    int number;
    System.out.print("Enter the number : ");
    Scanner s=new Scanner(System.in);
    number=s.nextInt();
    System.out.print("Factors of the given " + number + " are: ");
    for (int i = 1; i <= number; ++i)
    {
      if (number % i == 0) 
      {
        System.out.print(i + " ");
      }
    }
   }
}