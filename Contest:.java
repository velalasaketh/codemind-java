import java.util.*;
public class hr{
    public static void main(String args[])
    {
        Scanner h = new Scanner(System.in);
        int x=h.nextInt();
        int a=h.nextInt();
        int b=h.nextInt();
        if(x<=(1*a)+(2*b))
        {
            System.out.println("Qualify");
        }
        else
        {
            System.out.println("Not Qualify");
        }
    }
}