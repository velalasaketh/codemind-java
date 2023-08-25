import java.util.*;
public class hr{
    public static void main(String[] args)
    {
        Scanner h = new Scanner(System.in);
        int e,m,p,c,cs;
        e=h.nextInt();
        m=h.nextInt();
        p=h.nextInt();
        c=h.nextInt();
        cs=h.nextInt();
        if(e>34 && m>34 && p>34 && c>34 && cs>34)
        {
            System.out.println("PASSED");
        }
        else
        {
            System.out.println("FAILED");
        }
    }
}