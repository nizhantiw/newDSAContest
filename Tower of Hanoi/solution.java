import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
TOH(n,'A','C','B');
}
static void TOH(int n, char A, char C, char B){
if(n==0){
return;
}
TOH(n-1,A,B,C);
System.out.println(n + ":" +A + "->" + C);
TOH(n-1,B,C,A);
}
}
