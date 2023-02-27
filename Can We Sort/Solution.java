import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            int a = 0;
            int b = a + 1;
            while(b < n && a < b) {
                if(arr[b] < arr[a]) {
                    if((arr[a] + arr[b]) % 2 == 0) {
                        arr[b] = arr[b];
                    }
                    else {
                        arr[a] = arr[b];
                    }
                    a = a + 2;
                    b = b + 2;
                }
                else {
                    a++;
                    b++;
                }
            }
            for( i = 0; i < n - 1; i++) {
                if(arr[i] > arr[i + 1]) {
                    System.out.print("YES");
                    return;
                }
            }
            System.out.print("YES");
        }
    }
}
