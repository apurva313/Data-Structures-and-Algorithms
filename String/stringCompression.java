import  java.util.*;

public class stringCompression {
    public static void main(String[] args) {
        String str="aaabbbbccddddpeeeef";
        String ans=""+str.charAt(0);

        int count=1;
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(curr==prev){
                count++;
            }else{
                if(count>1) ans+=count;
                count=1;
                ans += curr;
            }
        }
        if(count>1) ans+=count; // last similiar count is not added in ans, so add manually
        System.out.println(ans);
    }
}
