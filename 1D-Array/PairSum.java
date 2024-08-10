import java.util.*;

public class PairSum {
    
    static int pairSumm(int[] arr, int target){

        int n=arr.length;
        int count=0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;

    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();

        int[] arr= new int[n];

        System.out.println("Enter the "+ n + " Elements: ");
        
        for(int i=0; i<arr.length; i++){
             arr[i]=sc.nextInt();
        }
        
       
        System.out.print("Enter the Target Sum: ");
        int target= sc.nextInt();

        System.out.println(pairSumm(arr, target));

    }
}
