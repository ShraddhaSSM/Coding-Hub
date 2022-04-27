import java.util.*;
public class sum 
{

    public static void main(String[] args)
     {
        int num = 50, sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}