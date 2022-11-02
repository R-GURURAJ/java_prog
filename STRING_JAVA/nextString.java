import java.util.Scanner;
/**
 * nextString
 */
public class nextString {

    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter an string :");
        String a=s.nextLine();
        String vow="aeiouAEIOU";
        String b="";
        for (int i = 0; i < a.length(); i++) {
            int q=a.charAt(i);
            char x;
            if(q>64&&q<91||q>96&&q<123){
            x=inp(q);
            }else{
            x=(char)(q);
            }
            b+=x;
        }
        b=b.toLowerCase();
        String v="";
        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < vow.length(); j++) {
                v="";
                if(b.charAt(i)==vow.charAt(j)){
                    v+=b.charAt(i);
                   b=b.substring(0,i)+v.toUpperCase()+b.substring(i+1, b.length());
                }
            }
        }
        System.out.println(b);

    }
    public static char inp(int q){
        q++;
            if(q==123){
                q=97;
            }
            if(q==90){
                q=65;
            }
            char x=(char)(q);
        return x;
        
    }
}