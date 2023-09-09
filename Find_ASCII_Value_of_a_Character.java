import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String input = scanner.nextLine();

       
        if (!input.isEmpty()) {

            char character = input.charAt(0);
            int asciiValue = (int) character;


            System.out.println(asciiValue);
        }

        scanner.close();
    }
}
