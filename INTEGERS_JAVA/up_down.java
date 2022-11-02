import java.util.Scanner;
    public class up_down {
        static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int[] x= {5,2,24,10,53,34,67};
        for (int i = 0; i < x.length; i++) {
            for (int j = i+1; j < x.length; j++) {
                if(x[i]>x[j]){
                    int twm=x[i];
                    x[i]=x[j];
                    x[j]=twm;
                }
            }
        }
        for (int i : x) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
        for(int i=0;i<x.length-1;i+=2){
                System.out.println(x[i+1]);
                System.out.println(x[i]);
        }
    }
}