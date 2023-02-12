import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.io.*;

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) throws IOException {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t > 0) {
            int N;
            long h;
            String line = br.readLine();
            String[] str = line.trim().split("\\s+");
            N = Integer.parseInt(str[0]);
            h = Long.parseLong(str[1]);
            long a[] = new long[N];
            line = br.readLine();
            str = line.trim().split("\\s+");
            for (int i = 0; i < N; i++) {
                a[i] = Long.parseLong(str[i]);
            }
            long ng = 0;
            long ok = h;
            while (ok - ng > 1) {
                long x = (ok + ng) / 2;
                long sum = 0;
                for (int n = 0; n < N; n++) {
                    if (n == N - 1) {
                        sum += x;
                    } else {
                        sum += Math.min(x, a[n + 1] - a[n]);
                    }
                }
                if (sum >= h) {
                    ok = x;
                } else {
                    ng = x;
                }
            }
            System.out.print(ok + "\n");
            t--;
        }
    }
}