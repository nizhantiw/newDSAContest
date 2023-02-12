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
int arr[][] = new int[n][m];
for(int i = 0; i < n; i++){
for(int j = 0; j < m; j++){
arr[i][j] = sc.nextInt();
}
}
int maxScore = Integer.MIN_VALUE;
for(int i = 0; i < n; i++){
int sum = 0;
for(int j = 0; j < m; j++){
sum += arr[i][j];
}
if(sum > maxScore){
maxScore = sum;
}
}
int result = maxScore \* 10;
System.out.println(result);
}
}
