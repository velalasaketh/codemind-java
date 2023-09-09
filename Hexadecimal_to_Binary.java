import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int q = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Process each query
        for (int i = 0; i < q; i++) {
            // Read the hexadecimal number as a string
            String hex = scanner.nextLine();

            // Convert the hexadecimal string to a binary string
            String binary = hexToBinary(hex);

            // Print the binary result
            System.out.println(binary);
        }

        scanner.close();
    }

    // Function to convert a hexadecimal string to a binary string
    public static String hexToBinary(String hex) {
        // Parse the hexadecimal string to an integer
        int decimal = Integer.parseInt(hex, 16);

        // Convert the integer to a binary string with leading zeros
        String binary = String.format("%" + (hex.length() * 4) + "s", Integer.toBinaryString(decimal)).replace(' ', '0');

        return binary;
    }
}
