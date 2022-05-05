import java.util.*;
class Bitwise
{
    public static void main(String args[])
    {
        int x,y,z,a;
        System.out.println("Enter the numbers x and y : ");
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();

        z=x&y;
        System.out.println("AND operation is "+ z);
        a=x|y;
        System.out.println("OR operation is "+ a);

    }
}