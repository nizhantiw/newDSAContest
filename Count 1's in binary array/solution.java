import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int CountOne(int arr[], int low, int high) {
        if (high >= low) {

            int mid = (low + high) / 2;
            if ((mid == high || arr[mid + 1] == 0) && (arr[mid] == 1))
                return mid + 1;

            if (arr[mid] == 1)
                return CountOne(arr, (mid + 1), high);

            return CountOne(arr, low, (mid - 1));

        }
        return 0;

    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(CountOne(arr, 0, n - 1));
            t--;
        }

    }
}