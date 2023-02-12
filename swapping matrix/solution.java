import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static int minMoves(int[][] matrix) {
int x = 0, y = 0;
for (int i = 0; i < 7; i++) {
for (int j = 0; j < 7; j++) {
if (matrix[i][j] == 1) {
x = i;
y = j;
break;
}
}
}
return Math.abs(3 - x) + Math.abs(3 - y);
}

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(minMoves(matrix));
    }

}
