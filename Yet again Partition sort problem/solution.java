import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
Scanner sc=new Scanner(System.in);
int n =sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n-1;i++)
{
if(arr[i]>arr[i+1])
{
System.out.println("YES");
return;
}
}
System.out.println("NO");
}
}
