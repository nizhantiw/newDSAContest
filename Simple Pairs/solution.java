import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int arr[] = new int[n];
for(int i=0; i<n; i++){
arr[i]=sc.nextInt();
}
Arrays.sort(arr);
long sum1 =0;
long sum2 =0;

        for(int i=0; i<n; i++){
            if(i<n/2){
                sum1 +=arr[i];
            }else{
                sum2 +=arr[i];
            }

        }


        System.out.println(sum2-sum1);
    }

}
