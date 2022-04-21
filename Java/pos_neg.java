import java.util.*;
public class pos_neg
 {

    public static void main(String args[])
     {
        int n;
        System.out.println("Enter the number : ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if (n < 0)
            System.out.println(n + " is a negative number.");
        else if ( n > 0)
            System.out.println(n + " is a positive number.");
        else
            System.out.println(n + " is 0");
    }
}