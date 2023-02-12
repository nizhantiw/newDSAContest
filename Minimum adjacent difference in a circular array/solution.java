import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int tc=sc.nextInt();
while(tc-->0){
int n= sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
min(arr,n);
}
}
static void min(int arr[], int n){
if(n<2)
return;
int res = Math.abs(arr[1]-arr[0]);
for(int i=2;i<n;i++)
res=Math.min(res,Math.abs(arr[i]-arr[i-1]));
res=Math.min(res, Math.abs(arr[n-1]-arr[0]));
System.out.println(res);
}
}
