import java.sql.SQLOutput;
import java.util.Scanner;

public class toggleChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: "  );
        StringBuffer sb = new StringBuffer(sc.nextLine());

        for(int i=0;i<sb.length();i++){
            char c = sb.charAt(i);
            boolean flag=true;
            if(c ==' ') continue;
            int ascii=(int)c;
            if(ascii>97) //small
                flag=false;
            if(flag==true){ //capital
                ascii=(ascii+32);
                sb.setCharAt(i,(char)ascii);
            }else{
                ascii=(ascii-32);
                sb.setCharAt(i,(char)ascii);
            }

        }
        System.out.println("Toggle String: "+sb.toString());
    }
}

// Apurva Kumar-05-09-2024

/*

Enter a string: 
ApUrva kUMar
Toggle String: aPuRVA KumAR

 */