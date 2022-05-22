import java.util.*;
class table 
{

    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter number of which table you want : ");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
            System.out.println("The Multiplication table is : ");
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}