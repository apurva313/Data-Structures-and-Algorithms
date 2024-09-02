import java.util.Scanner;

public class NumberSystemConversions_inBuildFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a conversion type:");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Decimal to Octal");
        System.out.println("3. Decimal to Hexadecimal");
        System.out.println("4. Binary to Decimal");
        System.out.println("5. Octal to Decimal");
        System.out.println("6. Hexadecimal to Decimal");
        System.out.println("7. Binary to Octal");
        System.out.println("8. Binary to Hexadecimal");
        System.out.println("9. Octal to Binary");
        System.out.println("10. Hexadecimal to Binary");
        System.out.println("11. Octal to Hexadecimal");
        System.out.println("12. Hexadecimal to Octal");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                decimalToBinary(scanner);
                break;
            case 2:
                decimalToOctal(scanner);
                break;
            case 3:
                decimalToHexadecimal(scanner);
                break;
            case 4:
                binaryToDecimal(scanner);
                break;
            case 5:
                octalToDecimal(scanner);
                break;
            case 6:
                hexadecimalToDecimal(scanner);
                break;
            case 7:
                binaryToOctal(scanner);
                break;
            case 8:
                binaryToHexadecimal(scanner);
                break;
            case 9:
                octalToBinary(scanner);
                break;
            case 10:
                hexadecimalToBinary(scanner);
                break;
            case 11:
                octalToHexadecimal(scanner);
                break;
            case 12:
                hexadecimalToOctal(scanner);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static void decimalToBinary(Scanner scanner) {
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary representation: " + binary);
    }

    public static void decimalToOctal(Scanner scanner) {
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal representation: " + octal);
    }

    public static void decimalToHexadecimal(Scanner scanner) {
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal representation: " + hexadecimal);
    }

    public static void binaryToDecimal(Scanner scanner) {
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal representation: " + decimal);
    }

    public static void octalToDecimal(Scanner scanner) {
        System.out.print("Enter an octal number: ");
        String octal = scanner.next();
        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Decimal representation: " + decimal);
    }

    public static void hexadecimalToDecimal(Scanner scanner) {
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = scanner.next();
        int decimal = Integer.parseInt(hexadecimal, 16);
        System.out.println("Decimal representation: " + decimal);
    }

    public static void binaryToOctal(Scanner scanner) {
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal representation: " + octal);
    }

    public static void binaryToHexadecimal(Scanner scanner) {
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        int decimal = Integer.parseInt(binary, 2);
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal representation: " + hexadecimal);
    }

    public static void octalToBinary(Scanner scanner) {
        System.out.print("Enter an octal number: ");
        String octal = scanner.next();
        int decimal = Integer.parseInt(octal, 8);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary representation: " + binary);
    }

    public static void hexadecimalToBinary(Scanner scanner) {
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = scanner.next();
        int decimal = Integer.parseInt(hexadecimal, 16);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary representation: " + binary);
    }

    public static void octalToHexadecimal(Scanner scanner) {
        System.out.print("Enter an octal number: ");
        String octal = scanner.next();
        int decimal = Integer.parseInt(octal, 8);
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal representation: " + hexadecimal);
    }

    public static void hexadecimalToOctal(Scanner scanner) {
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = scanner.next();
        int decimal = Integer.parseInt(hexadecimal, 16);
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal representation: " + octal);
    }
}
