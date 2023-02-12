import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
int n, k, j;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
k=sc.nextInt();
j=sc.nextInt();
int arr[]=new int[n];
int t=0;
for(int i=0; i<n;i++){
if(i==j-1){
t=sc.nextInt();
arr[i]=Integer.MAX_VALUE;
continue;
}
arr[i]=sc.nextInt();
}
Arrays.sort(arr);
for(int i=0; i<k-1;i++){
t += arr[i];
}
System.out.println(t);
}
}
