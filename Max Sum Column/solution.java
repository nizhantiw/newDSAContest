import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc=new Scanner(System.in);
int M=sc.nextInt();
int N=sc.nextInt();

        int matrix[][]=new int[M][N];
        for(int i=0; i<M;i++){
            for(int j=0; j<N;j++){
                matrix[i][j]=sc.nextInt();

            }
        }
        long sum=0;
        for(int i=0; i<N;i++){
            long sum1=0;
            for(int j=0; j<M;j++)
                sum1 += matrix[j][i];
                sum=Math.max(sum1,sum);
            }
            System.out.println(sum);

    }

}
