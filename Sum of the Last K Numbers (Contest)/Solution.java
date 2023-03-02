import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int k = sc.nextInt();
        Deque<Integer> deque = new LinkedList<>();
        long sum = 0;
        while (q-- > 0) {
            int type = sc.nextInt();
            if (type == 1) {
                int x = sc.nextInt();
                deque.addLast(x);
                sum += x;
                if (deque.size() > k) {
                    sum -= deque.removeFirst();
                }
            } else {
                System.out.println(sum);
            }
        }
    }
}
