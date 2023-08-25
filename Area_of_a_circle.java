import java.util.Scanner;
public class hr{
    public static void main(String[] args)
    {
        Scanner h = new Scanner(System.in);
        int r = h.nextInt();
        double area; 
        area = (3.14*r*r);
        System.out.printf("%.2f",area);

    }
}