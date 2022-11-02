import java.util.*;
public class array_num_remove_by_length {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        List <String>l=new ArrayList<>();
        System.out.println("enter the size of the array:");
        int a=s.nextInt();s.nextLine();
        System.out.println("enter the size of the array:");
        for (int i = 0; i < a; i++) {
            String ar=s.nextLine();
            l.add(ar);
        }
        System.out.println("enter the element length :");
        int k=s.nextInt();

        l.forEach((n) ->{
            int x=0;
            if (n.length()==k) {
                x=1;
            }
            if(x!=1){
                System.out.println(n);
            }
        } );
    }
}
