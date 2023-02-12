import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    long K = sc.nextLong();

    sc.close();

    long t = 0;
    long f = a * t * t + b * t + c;

    while (f < K) {
      t++;
      f = a * t * t + b * t + c;
    }

    System.out.println(t);

}
}
