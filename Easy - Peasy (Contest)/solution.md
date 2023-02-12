import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void smaller(int arr[], int n)  {
        // Your code here
        int odd = 0, even=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==1)
            odd++;
            else
            even++;
        }
        if(odd>0 && even>0)
        Arrays.sort(arr);

        for(int i=0;i<n;i++)
        System.out.print(arr[i] + " ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        smaller(arr, n);
    }

}