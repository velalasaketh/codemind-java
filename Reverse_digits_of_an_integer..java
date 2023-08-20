import java.util.*;
public class hr{
    public static void main(String[] args)
    {
        int n,rem,rev=0;
        Scanner h = new Scanner(System.in);
        n=h.nextInt();
        while(n!=0)
        {
            rem = n%10;
            rev = rev*10+rem;
            n =n /10;
        }
        System.out.printf("%d",rev);
    }
}