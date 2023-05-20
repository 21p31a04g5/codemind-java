import java.util.Scanner;
public class Average
{
    public static void main(String args[])
    {
        float a,b;
        float total;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        total=(float)(a*b);
        System.out.format("%.2f",total);
        sc.close();
    }
}