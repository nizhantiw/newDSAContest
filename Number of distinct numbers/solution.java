import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
int tc = sc.nextInt();
while(tc-->0){
int a = sc.nextInt();
int b = sc.nextInt();
HashSet<Integer> hs = new HashSet<>();
solve(hs,a,b);
System.out.println(hs.size());
}
}
public static void solve(HashSet<Integer>hs, int a, int b){
hs.add(a);
if(b>0){
solve(hs,a+3,b-1);
solve(hs,a-3,b-1);
solve(hs,a\*2,b-1);
}
}
}
