
// printing number in differnt number system //
// class basic
// {
//     public static void main( String args[])
//     {
//         int a=15;                 //decimal//
//         int b=0b1111;             // binary//
//         int c=0xF;                //hexadecimal//
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//     }
// }

// Converting decimal to binary form //
// class basic
// {
//     public static void main(String args[])
//     {
//         int A=6;
//         System.out.println(Integer.toBinaryString(A));
//     }
// }

// Sum of numbers //
// class basic
// {
//     public static void main(String args[])
//     {
//         int a=5;
//         float b=2.2f;
//         int c=9;
//         float sum=a+b+c;
//         System.out.println("Sum of numbers is : "+ sum);
//     }
// }

// Check if number is Ineger //
// import java.util.*;
// class basic 
// {
//     public static void main(String args[])
//     {
//         System.out.println("Enter the number : ");
//         Scanner s=new Scanner(System.in);
//          System.out.println(s.hasNextInt());
//     }
// }

// Finding if number is even or odd //
// import java.util.*;
// class basic
// {
//     public static void main(String agrs[])
//     {
//         int n;
//         System.out.println("Enter the number : ");
//         Scanner num=new Scanner(System.in);
//         n=num.nextInt();
//         if(n%2==0)
//         {
//             System.out.println("Number is Even");
//         }
//         else 
//         {
//            System.out.println("Number is Odd");
//         }
//     }
// }

// Printing a pattern //
import java.util.*;
// class basic
// {
//     public static void main(String args[])
//     {
//         int n;
//         System.out.println("Enter length of pattern : ");
//         Scanner s=new Scanner(System.in);
//         n=s.nextInt();
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                  System.out.print(" * ");
//             }
//             System.out.println("  ");
//         }
//     }
// }

class basic
{
    public static void main(String args[])
    {
        int n;
        System.out.println("Enter length of pattern : ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                 System.out.print(" * ");
            }
            System.out.println("  ");
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                 System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}


