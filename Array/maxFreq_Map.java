package Array;
import java.util.*;

public class maxFreq_Map {

    static int maxFrequency(int arr[], int n){
        Map<Integer, Integer> mp= new HashMap<>();

        for(int i=0; i<n; i++){
            int key=arr[i];
            if(mp.containsKey(key)){
                int freq=mp.get(key);
                freq++;
                mp.put(key, freq);
            }
            else{
                mp.put(key,1);
            }
        }
        int max_count = 0, res = -1; 
          
        for(Map.Entry<Integer, Integer> val : mp.entrySet()) 
        { 
            if (max_count < val.getValue()) 
            { 
                res = val.getKey(); 
                max_count = val.getValue(); 
            } 
        } 
          
        return res; 
    }

    public static void main(String[] args) {
        int arr[] = {40,50,30,40,50,30,30}; 
        int n = arr.length; 
          
        System.out.println(maxFrequency(arr, n));

    }
}
