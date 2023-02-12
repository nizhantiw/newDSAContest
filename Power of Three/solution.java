import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args)throws IOException {
// Your code here
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
int t = Integer.parseInt(br.readLine());

        while(t-->0){
            long n = Long.parseLong(br.readLine());
            if(n ==0){
                System.out.println(1);
                continue;
            }
            System.out.println(powerOf(n));
        }
    }
    public static long powerOf(long n){
        if(n<=0)return 0;

        long p = (long)(Math.log(n)/Math.log(3));

        if(gpSum(p)>=n)
        return power(3,p)+ powerOf(n- power(3,p));
        else
        return power(3,p+1);
    }
    public static long gpSum(long p){
        return (power(3,p+1)-1)/2;
    }
    public static long power(long base,long p){
        if(p==0)
        return 1;
        else
        return (base*power(base,p-1));
    }

}
