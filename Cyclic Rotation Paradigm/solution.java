import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int ans = arr[n - 1] - arr[0];
    for (int i = 0; i < n - 1; i++) {
      ans = Math.max(ans, arr[i] - arr[i + 1]);
    }
    for (int i = 1; i < n; i++) {
      ans = Math.max(ans, arr[i] - arr[0]);

    }
    for (int i = 0; i < n - 1; i++) {
      ans = Math.max(ans, arr[n - 1] - arr[i]);
    }
    System.out.println(ans);
  }
}