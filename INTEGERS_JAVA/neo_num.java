import java.util.Scanner;
    public class neo_num{
        static Scanner s=new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("enter an new num:");
            int a=s.nextInt();
            int b=a*a;
            int d=0;
            while (b>0) {
                d+=b%10;
                System.out.println(d);
                b/=10;
            }
            if(d==a){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
}