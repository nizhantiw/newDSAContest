import java.util.\*;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k = sc.nextInt();
int[][] b = new int[n][n];
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
b[i][j] = sc.nextInt();
}
}
int[][] a = new int[n + 1][n + 1];
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++) {
a[i][j] = a[i][j - 1] + b[i - 1][j - 1];
}
}
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++) {
a[i][j] += a[i - 1][j];
}
}
int ans = 0;
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++) {
int cnt = 0;
for (int l = 0; l <= Math.min(n - i, n - j); l++) {
cnt = a[i - 1][j - 1] + a[i + l][j + l] - a[i + l][j - 1] - a[i - 1][j + l];
if (cnt <= k) {
ans = Math.max(ans, l + 1);
}
}
}
}
System.out.println(ans);
}
}
