import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix [][] = new int[n][m];
        int rowIndex = 0;
        int maxOnes = 0;

        for(int i=0; i<n; i++){
            int count = 0;
            for(int j =0; j<m; j++){
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1){
                    count++;
                }
            }
            if(count > maxOnes){
                maxOnes = count;
                rowIndex = i;
            }
        }
        System.out.println(rowIndex);
    }

}
