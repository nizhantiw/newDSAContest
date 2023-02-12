import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
long[] arr = new long[n];
for(int i = 0; i< arr.length ; i++){
arr[i] = sc.nextInt();
}

        // long max_value;
        // long sum = 0;
        // for(int i = 0; i< arr.length-1; i++){
        //     for(int j = i+1; j<arr.length ; j++){
        //         if(i<j){
        //           max_value = Math.max(arr[i], arr[j]);
        //           sum = sum + max_value;
        //         }
        //     }
        // }
        // System.out.print(sum);
        long sum = 0;
        Arrays.sort(arr);
        for(int i = 0; i< arr.length ; i++){
            sum = sum + (i*arr[i]);
        }
         System.out.print(sum);
    }


}
