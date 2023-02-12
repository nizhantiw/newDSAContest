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
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int max1=Integer.MIN_VALUE;
int max2=Integer.MIN_VALUE;
for(int i=0;i<n;i++){
if(arr[i]>max1){
max2=max1;
max1=arr[i];
}else if(arr[i]>max2){
max2=arr[i];
}
}
System.out.print(max1+max2);
}
}
