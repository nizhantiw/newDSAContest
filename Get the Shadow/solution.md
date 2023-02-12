import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            int missing = 0;
            int repeating = 0;
            for (int i = 0; i < n; i++) {
                if (a[Math.abs(a[i]) - 1] > 0) {
                    a[Math.abs(a[i]) - 1] = -a[Math.abs(a[i]) - 1];
                } else {
                    repeating = Math.abs(a[i]);
                }
            }
            for (int i = 0; i < n; i++) {
                if (a[i] > 0) {
                    missing = i + 1;
                    break;
                }
            }
            System.out.println(repeating + " " + missing);
        }
    }
}