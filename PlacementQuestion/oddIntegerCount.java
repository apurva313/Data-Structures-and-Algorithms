import java.util.Scanner;
import java.util.*;

public class oddIntegerCount {
   
   static  int findOdd(int []arr, int n){

        int sum=0;
        for(int i=0; i<n; i++){
            if(arr[i]%2==1){
                sum+=arr[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the array lenth: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the array");
        for(int i=0; i<n; i++){
          arr[i]=sc.nextInt();
        }
        int ans=findOdd(arr,n);
        System.out.println("Answer: "+ans);
       
    }

}
