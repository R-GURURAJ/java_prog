/**
 * array_shuff
 */
import java.util.Random;
public class array_shuff {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int a[]={11,12,13,14,15,16,17,18,19};
        String aa=a.toString();
        String ans="";
        Random r=new Random();
        while (true) {
            int x=r.nextInt(9);
            System.out.println(x);
            if(aa.contains(x+"")){
                // System.out.println("x");
                if(!(ans.contains(x+""))){
                    ans+=x;
                    // System.out.println(ans);
                    if(ans.length()==a.length-1){
                        break;
                    }
                }            
             }
        }
        
        // System.out.println(ans);
    }
}

// import java.util.Random;
// public class array_shuff {
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5,6,7,8,9};
//         Random r=new Random();
//         for (int i = 0; i < a.length; i++) {
//             int x=r.nextInt(9);
//             int v=a[x];
//             a[x]=a[i];
//             a[i]=v;
//         }
//         for (Integer i:a) {
//             System.out.print(i+" ");
//         }
//     }
// }