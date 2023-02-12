import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
static int count = 0;
public static void balance(int open, int close, int n){
if(close==n){
count++;
return;
}
if(open>close){
balance(open, close+1, n);
}
if(open<n){
balance(open+1, close, n);
}
}
public static void main (String[] args) {
Scanner sc= new Scanner (System.in);
int n=sc.nextInt();
balance( 0, 0, n);
System.out.println(count);
}
}
