import java.util.Scanner;

public class TwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the no. of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the no. of Column: ");
        int cols = sc.nextInt();
        

        int[][] numbers = new int[rows][cols];
        
        System.out.println("Enter the Elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }

        }


        System.out.println("The Matrics are: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(" "+numbers[i][j]+" ");
            }   
            System.out.println();

        }
    }
}