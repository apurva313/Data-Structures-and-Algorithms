import java.util.Scanner;

public class toggleChar_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);

            if (Character.isUpperCase(c)) {
                sb.setCharAt(i, Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }

        System.out.println("Toggled string: " + sb.toString());
    }
}

// Apurva Kumar-05-09-2024

/*
Enter a string: 
ApUrva kUMar
Toggle String: aPuRVA KumAR
 */