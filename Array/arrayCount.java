// Java program to count occurrences 
import java.util.*;
import java.util.Scanner;

class arrayCount
{
    static int countOccurrences(int arr[], int n, int x)
    {
        int res = 0;
        for (int i=0; i<n; i++)
            if (x == arr[i])
              res++;
        return res;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        System.out.println("Enter the number to count occurrences:");
        int x = sc.nextInt();
        
        System.out.println("The occurence of "+ x +" is: "+countOccurrences(arr, n, x));
    }
}
