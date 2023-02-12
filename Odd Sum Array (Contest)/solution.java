import java.util.\*;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}
sc.close();

        boolean isSorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                if ((arr[i] + arr[i + 1]) % 2 == 0) {
                    isSorted = false;
                    break;
                }
            }
        }
        if (isSorted) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
