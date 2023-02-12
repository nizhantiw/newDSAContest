import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int[][] arr = new int[2][n];

        for (int i=0;i<2;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j] =sc.nextInt();
            }
        }

        int[][] dp = new int[3][n+1];
        /*
            0 0 0 0 0 0
            0 1 3 5 6 2
            0 2 4 8 4 2
        */
        for (int i=1;i<=2;i++) {
            for(int j=1;j<=n;j++) {
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]) +arr[i-1][j-1];
            }
        }

        System.out.println(dp[2][n]);
    }

}
