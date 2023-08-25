import java.util.*;
public class hr{
    public static void main(String[] args)
    {
        Scanner y = new Scanner(System.in);
        double a,b,c;
        double area;
        a=y.nextDouble();
        b=y.nextDouble();
        c=y.nextDouble();
        double s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}