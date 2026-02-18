import java.util.Scanner;
public class BooleanMatrix {
    private static void booleanMatrixProblem(int[][] mat, int m, int n) {
        boolean[] row = new boolean[m];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] == 1){
                    row[i] = true;
                    break;
                }
            }
        }
        for(int i=0; i<m; i++){
            if(row[i]){
                for(int j=0; j<n; j++){
                    mat[i][j] = 1;
                }
            }
        }

    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        booleanMatrixProblem(mat, m, n);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[i][j]);
                if(j!=n-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
