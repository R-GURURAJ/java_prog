/**
 * matrix_snake
 * 
 * Given an n x n matrix. In the given matrix, you have to print the elements of the matrix in the snake pattern.
 
 mat[][] = { {10, 20, 30, 40},{15, 25, 35, 45},{27, 29, 37, 48},{32, 33, 39, 50}};
 
 10 20 30 40 45 35 25 15 27 29 37 48 50 39 33 32 
 10 20 30 40 45 35 25 15 27 29 37 48 50 39 33 32
 */
public class matrix_snake {
    public static void main(String[] args) {
        int mat[][] = { {10, 20, 30, 40},{15, 25, 35, 45},{27, 29, 37, 48},{32, 33, 39, 50}};
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                    System.out.print(mat[i][j]+" ");
                }
                i++;
                for (int k = mat.length -1; k >=0 ; k--) {
                    System.out.print(mat[i][k]+" ");
            }
        }  
    }
}