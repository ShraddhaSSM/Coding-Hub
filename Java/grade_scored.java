import java.util.*;
class grade_scored
{
    public static void main(String args[])
  {  
    System.out.println("Enter your marks of following subject : ");
    double a,b,c,d,e;
    Scanner s=new Scanner(System.in);
    System.out.println("Maths : ");
    a=s.nextDouble();
    System.out.println("Chemistry : ");
    b=s.nextDouble();
    System.out.println("Physics : ");
    c=s.nextDouble();
    System.out.println("Social Science : ");
    d=s.nextDouble();
    System.out.println("Biology : ");
    e=s.nextDouble();

    double perc;
    perc=((a+b+c+d+e)/500)*100;
    System.out.println("Percentage Scored are : "+perc);

  }
    

}