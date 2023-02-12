import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k= sc.nextInt();

        //total n ropes
        //i wan't k peices means cut it k-1 times (same length)

        double[] ropes = new double[n];

        for (int i=0;i<n;i++) {
            ropes[i] = sc.nextDouble();
        }
        double left =0, right=1e9;

        while (right-left>0.000001) {
            double mid = left+ (right-left)/2;
            int piece=0;
            for (int i=0;i<n;i++) {
                piece+=ropes[i]/mid;
            }
            if (piece>=k) {
                left=mid;
            } else {
                right= mid;
            }
        }
        System.out.format("%.6f",left);


    }

}

/_
802/11 =72.909090
743/11=67.545454
457/11=41.545454
539/11=49.0000008
_/
