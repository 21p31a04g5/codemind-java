import java.util.Scanner;
public class add
{
    public static void main(String args[])
    {
        int a,b;
        int total;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.format("%d",a+b);
        sc.close();
    }
}