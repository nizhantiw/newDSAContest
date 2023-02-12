import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
static void modify(int arr[],int n){
if(n<=1)
return;
int prev=arr[0];
arr[0]=arr[0]*arr[1];
for(int i=1;i<n-1;i++){
int curr=arr[i];
arr[i]=prev*arr[i+1];
prev=curr;
}
arr[n-1]=prev\*arr[n-1];
}
public static void main (String[] args) {
// Your code here
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
modify(arr,n);
for(int i=0;i<n;i++)
System.out.print(arr[i]+" ");
}
}
