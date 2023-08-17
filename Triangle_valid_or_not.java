import java.util.*;
public class hr{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner h=new Scanner(System.in);
        a=h.nextInt();
        b=h.nextInt();
        c=h.nextInt();
        if(a+b>c)
        {
            System.out.println("Valid triangle");
        }
        else
        {
            System.out.println("Invalid triangle");
        }
    }
}