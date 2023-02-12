import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int m = sc.nextInt();
        int parry[] = new int[m];
        for(int i=0; i<m; i++){
            parry[i] = sc.nextInt();
        }
        Arrays.sort(parry);
        int count = 0;
        for(int i=m-1; i>=0; i--){
            if(n<=0){
                break;
            }
            count++;
            n -= parry[i];
        }
        System.out.println(count);
    }
}