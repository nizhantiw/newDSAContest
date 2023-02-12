import java.util.\*;

public class Main {
public static int findWakandaPoint(int[] arr) {
int n = arr.length;
int leftSum = 0;
int rightSum = 0;
for (int i = 0; i < n; i++) {
rightSum += arr[i];
}
for (int i = 0; i < n; i++) {
rightSum -= arr[i];
if (leftSum == rightSum) {
return i;
}
leftSum += arr[i];
}
return -1;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}
System.out.println(findWakandaPoint(arr));
}
}
