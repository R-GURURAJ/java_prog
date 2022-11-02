import java.util.Scanner;
public class dig {
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        System.out.println("<---Enter the no.of Rows--->");
        int r=Sc.nextInt();
        System.out.println("<---Enter the no.of Columns--->");
        int c=Sc.nextInt();
     int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                System.out.println("Matrix["+i+","+j+"]");
                arr[i][j]=Sc.nextInt();
            }
        }
for(int i=0;i<r;i++){
    System.out.print("|");
    for(int j=0;j<r;j++){
        if(i==j){
            System.out.print('*'+"");
        }
        else{
            System.out.print(arr[i][j]+"");
        }
    }
    System.out.println("|");
}
Sc.close();
    }
}

