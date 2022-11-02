import java.util.Scanner;
/**
 * recur
 */
public class recur_by_main {
    static Scanner s=new Scanner(System.in);
    static int in2=0,in=0;
    static int a=0;
    public static void main(String[] args) {
        if(in==0){
            System.out.print("enter the end :");
            in2=s.nextInt();
            in++;
        }
        if(a<=in2){
            System.out.println(a);
            a++;
            main(args);
        }
    }
}