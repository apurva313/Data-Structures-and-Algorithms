import java.util.*;

public class binaryToOctal {

    public static void binary2Octal(String binary) {
       

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
    public static void main(String[] args) {
        
        String binary="1101";
        binary2Octal(binary);
    }
}
