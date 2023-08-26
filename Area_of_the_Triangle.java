import java.util.*;
public class hr{
    public static void main(String[] args)
    {
        Scanner h = new Scanner(System.in);
        double a,b,c;
        a=h.nextDouble();
        b=h.nextDouble();
        c=h.nextDouble();
        double s = (a+b+c)/2;
        double ar =Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",ar);
    }
}