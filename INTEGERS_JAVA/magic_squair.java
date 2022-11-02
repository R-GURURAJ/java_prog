import java.util.HashSet;
import java.util.Set;
public class magic_squair {
    public static void main(String[] args) {
        int a[][]={{2,7,6},{9,5,1},{4,3,8}},a1=0,b1=0;
        Set<Integer> b=new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a.length; j++) {
                a1+=a[i][j];
                b1+=a[j][i];
            }
            b.add(a1); 
            a1=0;
            b.add(b1);
            b1=0; 
        }
        for (Integer r : b) {
            System.out.println(r); 
        }
        if (b.size()==1) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
       
    }
}