import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static int findminstep(int n, int[] arr){
if(n <= 1) return 0;
if(arr[n]!=0) return arr[n];
int count = 2000;
for(int i = n-1; i >= 1; i--){
if(n%i == 0){
int remaincount = findminstep(n-i, arr);
count = Math.min(count,remaincount);
}
}
arr[n] = count+1;
return arr[n];
}
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n+1];
System.out.println(findminstep(n, arr));
}
}
