/**
 * matrix_path
 */
public class matrix_path {

    public static void main(String[] args) {
        
        int s[][]= {{1,-2,1},{1,-2,1},{3,-4,1}};
        System.out.println(s.length);
        int sum=0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length; j++) {
                System.out.println(i+"  "+j+"  "+s[i][j]);
            }         
        }
    }
}