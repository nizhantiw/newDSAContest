import java.io._; // for handling input/output
import java.util._; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int arr2[]=new int[N];
int arr[]=new int[N];
for(int i=0;i<N;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<N;i++){
arr2[arr[i]-1]=i+1;
}
for(int i=0;i<N;i++){
System.out.print(arr2[i]+" ");
}
}
}
