import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
// Your code here
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k = sc.nextInt();
int arr[]= new int[n];
for(int i=0; i<n; i++){
arr[i]=sc.nextInt();
}

        for(int i=0; i<n; i++){

        if(k>=arr[i]){
            k -=arr[i];
            System.out.print("1");
        }else{
            System.out.print("0");



        }
        }

    }

}
