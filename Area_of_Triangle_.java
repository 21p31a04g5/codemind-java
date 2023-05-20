import java.util.Scanner;
public class Area
{
    public static void main(String args[])
    {
        double area,a,b,c,s;
    Scanner sc=new Scanner(System.in);
    a=sc.nextDouble();
    b=sc.nextDouble();
    c=sc.nextDouble();
    s=(a+b+c)/2;
    area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.printf("%.2f",area);
    }
    
    
}