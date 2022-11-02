import java.util.Random;
public class array_shuffel {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        Random r=new Random();
        for (int i = 0; i < a.length; i++) {
            int x=r.nextInt(9);
            int v=a[x];
            a[x]=a[i];
            a[i]=v;
        }
        for (Integer i:a) {
            System.out.print(i+" ");
        }
    }

}
