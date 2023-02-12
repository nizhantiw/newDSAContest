import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
private static int findMin(int[] arr, int low,int high)
{
if(low==high)
{
return arr[low];
}
int mid=(low+high)/2;
if(arr[mid]>arr[high])
{
return findMin(arr,mid+1,high);
}
else{
return findMin(arr,low,mid);
}
}
public static void main (String[] args) {
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int n=sc.nextInt();
int [] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int min=findMin(arr,0,n-1);
System.out.println(min);
}
}
}
