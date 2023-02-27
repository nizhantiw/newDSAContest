import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 00; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int minEle = arr[0];
        int maxEle = arr[0];
        for(int i = 0; i < n; i++) {
            minEle = Math.min(minEle, arr[i]);
            maxEle = Math.max(maxEle, arr[i]);
        }
        System.out.println(maxEle - minEle);
        // Your code here
    }
}
