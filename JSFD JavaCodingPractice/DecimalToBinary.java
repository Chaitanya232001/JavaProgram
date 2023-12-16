
import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scan.nextInt();

        String binary = convertToBinary(decimal);

        System.out.println("Binary representation: " + binary);

        scan.close();
    }

    public static String convertToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder); // Insert the remainder at the beginning
            decimal = decimal / 2;
        }

        return binary.toString();
    }
}
