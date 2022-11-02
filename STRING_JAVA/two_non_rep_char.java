import java.util.*;
public class two_non_rep_char {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter an string :");
        String a = s.nextLine();
        System.out.println("enter an string :");
        String b = s.nextLine();
        String ans = "";
        char[] aa = new char[a.length() + b.length()];
        HashMap<Character, Integer> map = new HashMap<>();
        int r = 0;
        for (int i = 0; i < a.length(); i++) {
            map.put(a.charAt(i), r++);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        r = 0;
        for (int i = 0; i < b.length(); i++) {
            map2.put(b.charAt(i), r++);
        }
        int ii = 0;
        for (Character s : map.keySet()) {
            aa[ii++] = s;
        }

        for (Character s : map2.keySet()) {
            aa[ii++] = s;
        }
        System.out.println(ii);
        for (Character s : aa) {
            System.out.println(s);
        }
        int xx=0;
        for(int i=0;i<ii;i++){
            xx=0;
            for(int j=0;j<ii;j++){
                if(aa[i]==aa[j]){
                    xx++;
                }
            }
            if(xx==1){
             ans+=aa[i];
            }
            
        }
        System.out.println(ans);
    }
}
