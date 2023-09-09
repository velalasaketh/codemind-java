import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int celsius = scanner.nextInt();

        double fahrenheit = 32 + (celsius * 9.0 / 5.0);

        String formattedResult = String.format("%.2f", fahrenheit);

        System.out.println(formattedResult);

        scanner.close();
    }
}
