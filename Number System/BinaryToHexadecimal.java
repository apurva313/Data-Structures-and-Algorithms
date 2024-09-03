import java.util.Scanner;

public class BinaryToHexadecimal {

    public static String binary2Hexadecimal(String binary) {
        // Step 1: Convert Binary to Decimal
        int decimal = 0;
        int n = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0'; 
            decimal += bit * Math.pow(2, n); 
            n++;
        }

        // Step 2: Convert Decimal to Hexadecimal
        String hex = "";

        while (decimal > 0) {
            int remainder = decimal % 16;
            char hexChar = (remainder < 10) ? (char)(remainder + '0') : (char)(remainder - 10 + 'A');
            hex = hexChar + hex;
            decimal = decimal / 16;
        }
        

        return hex.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine(); 

        String hexadecimal = binary2Hexadecimal(binary); 
        System.out.println("Hexadecimal: " + hexadecimal); 
    }
}
