import java.util.*;
public class hr{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner h=new Scanner(System.in);
        a=h.nextInt();
        b=h.nextInt();
        c=h.nextInt();
        if(a==b&&b==c&&c==a)
        {
            System.out.println("Equilateral triangle");
        }
        else if(a==b||b==c||c==a)
        {
            System.out.println("Isosceles triangle");
        }
        else
        {
            System.out.println("Scalene triangle");
        }
    }
}