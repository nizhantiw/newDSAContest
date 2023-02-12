import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int digitCount(long num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long t = sc.nextLong();
        long ans = -1;
        long start = 0;
        long end = 1000000000L;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long x = mid;
            long curr = (a * x) + (b * digitCount(x));
            if (curr <= t) {
                ans = x;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(ans);
    }
}