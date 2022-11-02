import java.util.Scanner;
    public class iden {
        static Scanner s=new Scanner(System.in);
        public static void main(String[] args) {
            System.out.print("enter the row: ");
            int r=s.nextInt();
            System.out.print("enter the column : ");
            int c=s.nextInt();
            int [][]arr=new int[r][c];
            int [][]arr2=new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j= 0; j < c; j++) {
                    arr[i][j]=s.nextInt();
                }
            }
            for (int i = 0; i < r; i++) {
                for (int j= 0; j < c; j++) {
                    arr2[j][i]=arr[i][j];
                }
            }

            
    }
}