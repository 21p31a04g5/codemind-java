import java.util.Scanner;
public class average
{
    public static void main(String args[])
    {
        int a,b;
        float res;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        res=(float)(a+b)/2;
        System.out.format("%.4f",res);
        sc.close();
    }
}