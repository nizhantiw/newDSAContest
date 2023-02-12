import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
int tc = sc.nextInt();
while (tc-->0) {
int n = sc.nextInt();
int[] arr = new int[n];
for (int i=0;i<n;i++) {
arr[i]= sc.nextInt();
}

            System.out.println(getResult(n,arr));
        }
    }

    private static int getResult(int n,int[] arr) {
        if(n==1) {
            return n;
        }
        int count=0;
        for ( int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]) {
                count++;
            }
        }
        return n-count;
    }

}
