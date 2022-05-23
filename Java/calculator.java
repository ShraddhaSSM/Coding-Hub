import java.util.*;
class calculator
{
    public static void main(String args[])
    {
        int a,b;
        int result;
        int op;
        System.out.println("Enter two numbers");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Enter Your Choice: \n 1 for Addition \n 2 for Substraction \n 3 for Multiplication \n 4 for Division");
        op=s.nextInt();
    
     switch(op)
     {
        case 1 :
           result=a+b;
           System.out.println("Sum is "+ result);
           break;
        case 2 :
           result=a-b;
           System.out.println("Substraction is "+ result);
           break;
        case 3 :
           result=a*b;
           System.out.println("Multiplication is "+ result);
           break;
        case 4 :
           result=a/b;
           System.out.println("Division is "+ result);
           break;
        default:
           System.out.println("Wrong input");
           break;
     }
    }
}