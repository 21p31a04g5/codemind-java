import java.util.Scanner;
public class mod
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        
        System.out.println(a%b);
        sc.close();
    }
}