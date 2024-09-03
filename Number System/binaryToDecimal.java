import java.util.*;

public class binaryToDecimal {

    public static void binary2Decimal(String binary) {
       

        // Step 1: Convert Binary to Decimal
        int decimal = 0;
        int n = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, n);
            n++;
        }

        System.out.println("Decimal: " + decimal);
    }
    public static void main(String[] args) {
        
        String binary="1101";
        binary2Decimal(binary);
    }
}
