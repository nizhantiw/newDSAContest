import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int num = sc.nextInt();
            int count = 0;
            while (num != 0) {
                count++;
                num /= 10;
            }
            System.out.println(count);
        }
    }
}