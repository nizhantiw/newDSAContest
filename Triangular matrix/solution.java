import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[][]matrix = new int[n][n];
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
matrix[i][j] = sc.nextInt();
}
}
int upperSum = 0, lowerSum = 0;
for(int i = 0; i < n; i++) {
for(int j = 0; j < n; j++) {
if(i <= j) {
upperSum+=matrix[i][j];
}
if(i >= j) {
lowerSum+=matrix[i][j];
}
}
}
System.out.println(upperSum+" "+lowerSum);
// Your code here
}
}
