import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int k = sc.nextInt();
        while(k--> 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int value = countRange(arr,n,x,y);
            System.out.print(value+" ");
        }
    }
    static int lInd(int arr[], int n, int x) {
        int l = 0, h = n-1;
        while(l<=h) {
            int mid = (l+h)/2;
            if(arr[mid] >= x) 
            h = mid-1;
            else
            l = mid+1;
        }
        return l;
    }
    static int rInd(int arr[], int n, int y) {
        int l = 0, h = n-1;
        while(l<=h) {
            int mid = (l+h)/2;
            if(arr[mid] <= y) 
            l = mid+1;
            else
            h= mid-1;
        }
        return h;
    } 
    static int countRange(int arr[], int n, int x, int y) {
        int count = 0;
        count = rInd(arr,n,y) - lInd(arr,n,x) + 1;
        return count;
    }
        // Your code here
    }
