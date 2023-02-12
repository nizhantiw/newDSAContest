import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr= new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int[] temp= new int[n];
int j=0;
for(int i=0;i<n;i++){
if(arr[i]<0){
temp[j]=arr[i];
j++;
}
}
int k=j;
for(int i=0;i<n;i++){
if(arr[i]>0){
temp[k]=arr[i];
k++;
}
}
for(int i=0;i<n;i++){
System.out.print(temp[i]+" ");
}
}
}
