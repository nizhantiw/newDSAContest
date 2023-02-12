import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[][] = new int[n][n];
for(int i =0;i<n;i++){
for(int j =0;j<n;j++){

               System.out.print(i+j +" ");
            }


            System.out.println();
        }

    }

}
