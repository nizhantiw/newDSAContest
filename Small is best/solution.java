import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] a = new int[n];
for (int i = 0; i < n; i++) {
a[i] = sc.nextInt();
}
Stack<Integer> stack = new Stack<>();
int result = 0;
for (int i = 0; i < n; i++) {
while (!stack.isEmpty() && a[stack.peek()] > a[i]) {
stack.pop();
}
if (stack.isEmpty()) {
result++;
}
stack.push(i);
}
System.out.println(result);
}
}
