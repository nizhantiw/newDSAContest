import java.io._; // for handling input/output
import java.util._; // contains Collections framework
import java.math.BigInteger;

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
long w = sc.nextLong();
long h = sc.nextLong();
int n = sc.nextInt();
long s =0L,e = 1000000000000000L;
long ans =e;
while(s<=e){
long m = (s+e)/2;
long rowFit = m/w;
long colFit = m/h;
BigInteger maxFit = new BigInteger(String.valueOf(rowFit)).multiply(new BigInteger(String.valueOf(colFit)));
if(maxFit.compareTo(BigInteger.valueOf(n))>=0){
ans=m;
e=m-1;
}
else{
s=m+1;
}
}
System.out.println(ans);
}
}
