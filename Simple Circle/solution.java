import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[] = new int[n];
for(int i = 0; i < n; i++){
arr[i] = sc.nextInt();
}
Arrays.sort(arr);
long res = arr[n-1];
for(int i = n - 2, x = 1; x < n - 2; x += 2, i -= 1){
res += 2\*arr[i];
}
System.out.println(res);
}
}
