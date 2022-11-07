/**
 * matrix_path
 */
public class matrix_path {

    public static void main(String[] args) {
        matrix_path kk= new matrix_path();
        int s[][]= {{1,-2,1},{1,-2,1},{3,-4,1}};
        System.out.println(s.length);
        int sum=0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                kk.path(j,i,s);
            }         
        }
    }
    public int path(int i,int j,int[][] s) {
        int x=0;
        System.out.println(i+"  "+j+"  ");
        for (int j2 = 0; j2 < s.length; j2++) {
            System.out.println(s[j2][j]);
        }
        System.out.println("-------------------");
        return 0;
    }
}