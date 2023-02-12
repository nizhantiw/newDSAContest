import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {

        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n-1;i++){
            arr[i]=scan.nextInt();
        }
        int sum= n*(n+1)/2;
        int total =0;
        for(int i=0;i<n;i++){
            total = total+arr[i];
        }
        int b=sum-total;
        System.out.println(b);
    }

}
