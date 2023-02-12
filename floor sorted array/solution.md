import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();

        while(t-- >0){
            int n=ob.nextInt();
            long x=ob.nextInt();

            long[] arr=new long[n];
            for(int i=0; i<n;i++){
                arr[i]=ob.nextInt();

            }
            int index= floorSearch(arr, 0, n-1, x);
            System.out.println(index);
        }
    }
    static public int floorSearch(long[] arr, int low, int high, long x){
        if(low>high) return -1;
        if(x>=arr[high]) return high;
        int mid=(low+high)/2;
        if(arr[mid]==x) return mid;
        if(mid>0 && arr[mid-1]<=x && x<arr[mid]) return mid-1;
        if(x<arr[mid]) return floorSearch(arr, low, mid-1, x);
        return floorSearch(arr, mid+1, high, x);
    }
}