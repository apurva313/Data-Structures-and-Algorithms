package Array;
import java.util.*;


public class maxFreq_HashMap {
        public static void main(String[] args) {
            int [] arr={1,2,6,2,1,1,1,2,2,3,60};
            Map<Integer, Integer> freq=new HashMap<>();
            for(int el  : arr){
                if(!freq.containsKey(el)){
                    freq.put(el,1);
                }
                else{
                    freq.put(el, freq.get(el)+1);
                }
            }
            System.out.println("Frequency MAP");
            System.out.println(freq.entrySet());

            int mxFreq=0, ansKey=-1;

            for (var e: freq.entrySet()){
                if(e.getValue() > mxFreq){
                    mxFreq=e.getValue();
                    ansKey=e.getKey();
                }
            }
            System.out.printf("%d has mac frequency and it occurs %d times",ansKey,mxFreq);
        }
}
