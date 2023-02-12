import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static double pow(double X, int N){
if(N==0) return 1;
if(N<0){
X=1/X;
N=-N;

        }
        double result=1;
        while(N>0){
            if(N%2 == 1) result *= X;
            X *= X;
            N /=2;
        }
        return result;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        while(T-- >0){
            double X=sc.nextDouble();
            int N=sc.nextInt();

        double result=pow(X, N);
        System.out.printf("%.2f\n", result);
    }
    }

}
