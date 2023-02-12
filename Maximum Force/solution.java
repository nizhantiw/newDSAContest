import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int k = in.nextInt();
long[] arr = new long[n];
for(int i=0; i<n; i++){
arr[i] = in.nextInt();
}
for(int i=0; i<n; i++){
if(arr[i]<0){
arr[i] = arr[i]*(-1);
}
}
Arrays.sort(arr);
for(int i=0, j=n-1; i<j; i++, j--){
long temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
long ans = 0;
for(int i=0; i<k; i++) {
ans = ans + arr[i]*arr[i];
}
System.out.print(ans);
}
}
