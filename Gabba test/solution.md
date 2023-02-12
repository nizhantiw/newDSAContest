import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long l =0, r = n;
        long s = 0;
        while(l<=r){
            long m1=l+(r-l)/2;
            if(a*m1<=m+(n-m1)*b){
                s=m1;
                l=m1+1;
            }
            else{
                r = m1-1;
            }
        }
        System.out.println(s);

    }
}