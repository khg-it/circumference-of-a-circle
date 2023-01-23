import java.util.*;
public class radius{
    public static void circumference(int k)
    {         double pi=3.14;
              double cir=2*pi*k;
              System.out.println(cir);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        circumference(r);
    }
}