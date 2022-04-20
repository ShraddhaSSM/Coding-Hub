import java.util.*;
public class swap
 {

    public static void main(String[] args)
     {

        int n1,n2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number : ");
        n1=s.nextInt();
        System.out.println("Enter second number : ");
        n2=s.nextInt();

        System.out.println("....Before....");
        System.out.println("First number = " + n1);
        System.out.println("Second number = " + n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("....After....");
        System.out.println("First number = " + n1);
        System.out.println("Second number = " + n2);
    }
}