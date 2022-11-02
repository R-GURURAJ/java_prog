import java.util.Scanner;
import java.lang.Math;
public class sumit_string {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the string :");
        String a=s.nextLine();
        String ans="YES";
        for (int i = 0; i < a.length()-1; i++) {
            if(Math.abs(a.charAt(i)-a.charAt(i+1))==1||Math.abs(a.charAt(i)-a.charAt(i+1))==25){
                continue;
            }else{
                ans="no";
                break;
            }
        }
        System.out.println(ans);
    }
}
