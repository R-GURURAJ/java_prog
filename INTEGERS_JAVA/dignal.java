import java.util.Scanner;

public class dignal {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter the row: ");
        int r=s.nextInt();
        System.out.print("enter the column : ");
        int c=s.nextInt();
        int [][]arr=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j= 0; j < r; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j= 0; j < r; j++) {
                if(i==j){
                    System.out.print('*'+" ");
                }
                else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}

// for (int[] is : arr) {
//     for (int is2 : is) {
//         System.out.print(is2+" ");
//     }
//     System.out.println();
// }