// import java.lang.*;
// import java.util.*;
// class area_of_triangle
// {
//  public static void main(String args[])
//  {
//    int area,length,breath;
//    System.out.println("Enter length and breath of Triangle ");
//    Scanner s=new Scanner(System.in);
//    length=s.nextInt();
//    breath=s.nextInt();
//    area=(length*breath)/2;
//    System.out.println("Area of Triangle is "+ area);
//  }
// }

// Other formula of area of triangle //
// import java.util.*;
// class area_of_triangle
// {
//  public static void main(String args[])
//  {
//      int a,b,c;
//      float s;
//      double area;
//      System.out.println("Enter vales of sides of triangle : ");
//      Scanner sc=new Scanner(System.in);
//      a=sc.nextInt();
//      b=sc.nextInt();
//      c=sc.nextInt();
//      s=(a+b+c)/2f;
//      System.out.println("Value of s is : "+s);
//      area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
//      System.out.println("Area of Triangle is : "+area);
//  }
// } 

// Finding roots of equation //
// import java.util.*;
// class  area_of_triangle
// {
//     public static void main(String args[])
//     {
//         int a,b,c;
//         double r1,r2;
//         System.out.println("Enter vales of a,b,c : ");
//         Scanner s=new Scanner(System.in);
//         a=s.nextInt();
//         b=s.nextInt();
//         c=s.nextInt();
//         r1=(-b+Math.sqrt((b*b)-4*a*c))/(2*a);
//         r2=(-b-Math.sqrt((b*b)-4*a*c))/(2*a);
//         System.out.println("Roots are "+ r1+" and "+r2);
//     }
// }

// Cuboid //
import java.util.*;
class  area_of_triangle
{
    public static void main(String args[])
    {
        int l,b,h;
        int a,v;
        System.out.println("Enter values of length, breath,height : ");
        Scanner s=new Scanner(System.in);
        l=s.nextInt();
        b=s.nextInt();
        h=s.nextInt();
        a=2*(l*b+l*h+b*h);
        v=l*b*h;
        System.out.println("Area and Volume of cuboid is : " +a +" and "+v);
        
    }
}