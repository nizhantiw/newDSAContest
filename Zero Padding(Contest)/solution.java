import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long ans=0;
int p=sc.nextInt();
while(p-->0){
ans+=4\*(1+n);
n=n+2;
}
System.out.println(ans);
}
}
