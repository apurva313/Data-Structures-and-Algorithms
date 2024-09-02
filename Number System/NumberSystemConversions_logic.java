import java.util.Scanner;

public class NumberSystemConversions_logic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a conversion type:");
        System.out.println("1. Octal to Binary");
        System.out.println("2. Octal to Decimal");
        System.out.println("3. Octal to Hexadecimal");
        System.out.println("4. Decimal to Binary");
        System.out.println("5. Decimal to Octal");
        System.out.println("6. Decimal to Hexadecimal");
        System.out.println("7. Binary to Decimal");
        System.out.println("8. Binary to Octal");
        System.out.println("9. Binary to Hexadecimal");
        System.out.println("10. Hexadecimal to Decimal");
        System.out.println("11. Hexadecimal to Binary");
        System.out.println("12. Hexadecimal to Octal");

        System.out.println();

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                octalToBinary(scanner);
                break;
            case 2:
                octalToDecimal(scanner);
                break;
            case 3:
                octalToHexadecimal(scanner);
                break;
            case 4:
                decimalToBinary(scanner);
                break;
            case 5:
                decimalToOctal(scanner);
                break;
            case 6:
                decimalToHexadecimal(scanner);
                break;
            case 7:
                binaryToDecimal(scanner);
                break;
            case 8:
                binaryToOctal(scanner);
                break;
            case 9:
                binaryToHexadecimal(scanner);
                break;
            case 10:
                hexadecimalToDecimal(scanner);
                break;
            case 11:
                hexadecimalToBinary(scanner);
                break;
            case 12:
                hexadecimalToOctal(scanner);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static void octalToBinary(Scanner scanner) {
        System.out.print("Enter an octal number: ");
        int octal = scanner.nextInt();

        // Step 1: Convert Octal to Decimal
        int decimal = 0;
        int n = 0;

        while (octal > 0) {
            int temp = octal % 10;
            decimal += temp * Math.pow(8, n);
            octal = octal / 10;
            n++;
        }

        // Step 2: Convert Decimal to Binary
        String binary = "";
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2;
        }

        System.out.println("Binary: " + binary);
    }

    public static void octalToDecimal(Scanner scanner) {
        System.out.print("Enter an octal number: ");
        int octal = scanner.nextInt();

        int decimal = 0;
        int n = 0;

        while (octal > 0) {
            int temp = octal % 10;
            decimal += temp * Math.pow(8, n);
            octal = octal / 10;
            n++;
        }

        System.out.println("Decimal: " + decimal);
    }

    public static void octalToHexadecimal(Scanner scanner) {
        System.out.print("Enter an octal number: ");
        int octal = scanner.nextInt();

        // Step 1: Convert Octal to Decimal
        int decimal = 0;
        int n = 0;

        while (octal > 0) {
            int temp = octal % 10;
            decimal += temp * Math.pow(8, n);
            octal = octal / 10;
            n++;
        }

        // Step 2: Convert Decimal to Hexadecimal
        String hexadecimal = "";
        while (decimal > 0) {
            int remainder = decimal % 16;
            hexadecimal = getHexChar(remainder) + hexadecimal;
            decimal = decimal / 16;
        }

        System.out.println("Hexadecimal: " + hexadecimal);
    }

    public static void decimalToBinary(Scanner scanner) {
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String binary = "";
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2;
        }

        System.out.println("Binary: " + binary);
    }

    public static void decimalToOctal(Scanner scanner) {
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String octal = "";
        while (decimal > 0) {
            int remainder = decimal % 8;
            octal = remainder + octal;
            decimal = decimal / 8;
        }

        System.out.println("Octal: " + octal);
    }

    public static void decimalToHexadecimal(Scanner scanner) {
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String hexadecimal = "";
        while (decimal > 0) {
            int remainder = decimal % 16;
            hexadecimal = getHexChar(remainder) + hexadecimal;
            decimal = decimal / 16;
        }

        System.out.println("Hexadecimal: " + hexadecimal);
    }

    public static void binaryToDecimal(Scanner scanner) {
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();

        int decimal = 0;
        int n = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, n);
            n++;
        }

        System.out.println("Decimal: " + decimal);
    }

    public static void binaryToOctal(Scanner scanner) {
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();

        // Step 1: Convert Binary to Decimal
        int decimal = 0;
        int n = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, n);
            n++;
        }

        // Step 2: Convert Decimal to Octal
        String octal = "";
        while (decimal > 0) {
            int remainder = decimal % 8;
            octal = remainder + octal;
            decimal = decimal / 8;
        }

        System.out.println("Octal: " + octal);
    }

    public static void binaryToHexadecimal(Scanner scanner) {
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();

        // Step 1: Convert Binary to Decimal
        int decimal = 0;
        int n = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, n);
            n++;
        }

        // Step 2: Convert Decimal to Hexadecimal
        String hexadecimal = "";
        while (decimal > 0) {
            int remainder = decimal % 16;
            hexadecimal = getHexChar(remainder) + hexadecimal;
            decimal = decimal / 16;
        }

        System.out.println("Hexadecimal: " + hexadecimal);
    }

    public static void hexadecimalToDecimal(Scanner scanner) {
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = scanner.next();

        int decimal = 0;
        int n = 0;

        for (int i = hexadecimal.length() - 1; i >= 0; i--) {
            char hexChar = hexadecimal.charAt(i);
            int hexValue = Character.isDigit(hexChar) ? hexChar - '0' : hexChar - 'A' + 10;
            decimal += hexValue * Math.pow(16, n);
            n++;
        }

        System.out.println("Decimal: " + decimal);
    }

    public static void hexadecimalToBinary(Scanner scanner) {
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = scanner.next();

        // Step 1: Convert Hexadecimal to Decimal
        int decimal = 0;
        int n = 0;

        for (int i = hexadecimal.length() - 1; i >= 0; i--) {
            char hexChar = hexadecimal.charAt(i);
            int hexValue = Character.isDigit(hexChar) ? hexChar - '0' : hexChar - 'A' + 10;
            decimal += hexValue * Math.pow(16, n);
            n++;
        }

        // Step 2: Convert Decimal to Binary
        String binary = "";
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2;
        }

        System.out.println("Binary: " + binary);
    }

    public static void hexadecimalToOctal(Scanner scanner) {
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = scanner.next();

        // Step 1: Convert Hexadecimal to Decimal
        int decimal = 0;
        int n = 0;

        for (int i = hexadecimal.length() - 1; i >= 0; i--) {
            char hexChar = hexadecimal.charAt(i);
            int hexValue = Character.isDigit(hexChar) ? hexChar - '0' : hexChar - 'A' + 10;
            decimal += hexValue * Math.pow(16, n);
            n++;
        }

        // Step 2: Convert Decimal to Octal
        String octal = "";
        while (decimal > 0) {
            int remainder = decimal % 8;
            octal = remainder + octal;
            decimal = decimal / 8;
        }

        System.out.println("Octal: " + octal);
    }

    public static String getHexChar(int remainder) {
        if (remainder < 10) {
            return String.valueOf(remainder);
        } else {
            return String.valueOf((char) (remainder - 10 + 'A'));
        }
    }
}
