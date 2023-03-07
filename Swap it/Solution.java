import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p[]= new int[n];
        for(int i=0; i<n; i++){
            p[i]= sc.nextInt();
        }
        sc.close();

        if(isSorted(p)){
            System.out.println("YES");
        }else{
            boolean found = false;
            for(int i=0; i<n && !found; i++){
                for(int j=i+1; j<n && !found; j++){
                    swap(p,i,j);
                    if(isSorted(p)){
                        found = true;
                        System.out.println("YES");
                    }
                    swap(p,i,j);
                }
            }
            if(!found){
                System.out.println("NO");
            }
        }
    }
    private static boolean isSorted(int arr[]){
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    private static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
