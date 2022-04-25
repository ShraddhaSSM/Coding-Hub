import java.util.*;
public class Factorial {

    public static void main(String[] args) {

        int num;
        System.out.println("Entrt the number : ");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}