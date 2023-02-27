import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int i = 0;
        int startrow = 0;
        int startcol = 0;

        while(startrow < n && startcol < n) {
            for( i = startrow; i < n; i++) {
                System.out.print(arr[i][startcol] + " ");
            }
            startcol++;
            for(i = startcol; i < n; i++) {
                System.out.print(arr[n - 1][i] + " ");
            }
            int m = n;
            m--;
            if(startrow < m) {
                for(i = m - 1; i >= startrow; i--) {
                    System.out.print(arr[i][n - 1] + " ");
                }
                n--;
            }
            if(startcol < n) {
                for(i = n - 1; i >= startcol; i--) {
                    System.out.print(arr[startrow][i] + " ");
                }
                startrow++;
            }
        }
    }
}
