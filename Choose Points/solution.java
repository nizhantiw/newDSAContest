import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) throws Exception {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String[] line1a = line1.split(" ");
        long n = Long.parseLong(line1a[0]);
        long d = Long.parseLong(line1a[1]);
        long[] valueA = new long[(int) n];
        String line2 = br.readLine();
        String[] line2a = line2.split(" ");
        for (int i = 0; i < n; i++) {
            valueA[i] = Long.parseLong(line2a[i]);
        }
        Arrays.sort(valueA);
        System.out.println(choosePoint(valueA, n, d));
    }

    static long choosePoint(long[] a, long n, long d) {
        long ways = 0;
        if (d == n) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            long high = upperLimit(a, 0, n, a[i] + d);
            long noe = high - (i + 1);
            if (noe >= 2) {
                ways += (noe * (noe - 1) / 2);
            }
        }
        return ways;
    }

    static long upperLimit(long[] a, long l, long h, long d) {
        while (l < h) {
            long mid = (long) l + (h - l) / 2;
            if (a[(int) mid] > d)
                h = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}