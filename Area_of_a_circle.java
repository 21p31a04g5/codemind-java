import java.util.Scanner;
public class Area
{
    public static void main(String args[])
    {
        int r;
        float Area;
    Scanner sc=new Scanner(System.in);
    r=sc.nextInt();
    Area=(float)3.14*r*r;
    System.out.format("%.2f",Area);
    }
    
    
}