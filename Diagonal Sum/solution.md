import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int primaryDiagonalSum = 0;
        int secondaryDiogonalSum = 0;
        for(int i = 0; i < n; i++){
            primaryDiagonalSum += matrix[i][i];
        }
        for(int i =0; i < n; i++){
            secondaryDiogonalSum += matrix[i][n - i - 1];
        }
        System.out.println(primaryDiagonalSum + " " + secondaryDiogonalSum);
    }
}