import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of queries
        int q = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Process each query
        for (int i = 0; i < q; i++) {
            // Read the binary number as a string
            String binary = scanner.nextLine();

            // Convert the binary string to an octal string
            String octal = binaryToOctal(binary);

            // Print the octal result
            System.out.println(octal);
        }

        scanner.close();
    }

    // Function to convert a binary string to an octal string
    public static String binaryToOctal(String binary) {
        // Convert the binary string to its decimal equivalent
        int decimal = Integer.parseInt(binary, 2);

        // Convert the decimal integer to an octal string
        String octal = Integer.toOctalString(decimal);

        return octal;
    }
}
