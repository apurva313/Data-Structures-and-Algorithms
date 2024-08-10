import java.util.*;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n=sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n; j++){
                System.out.print((i+j)-1 +" ");
            }
            System.out.println();
        }
    }
}

/*
    OutPut

    Enter the n: 6
01 02 03 04 05 06 
07 08 09 10 11 12 
13 14 15 16 17 18 
19 20 21 22 23 24
25 26 27 28 29 30
31 32 33 34 35 36

 */
