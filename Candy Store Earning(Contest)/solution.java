import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] candies = new long[n];
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextLong();
        }

        Arrays.sort(candies);
        long sum = 0;
        for (int i = 0; i < k; i++) {
            if (candies[i] < 0) {
                sum += Math.abs(candies[i]);
            }
        }
        System.out.println(sum);
    }
}