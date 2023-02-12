import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
int row = sc.nextInt();
int col = sc.nextInt();
int mat[][] = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for(int j=0;j<row;j++){
            for(int i=j;i>=0;i--){
                if(j-i >= col){
                    break;
                }
                System.out.print(mat[i][j-i]+" ");
            }
            System.out.println();
        }

        for(int j=1;j<col;j++){
            for(int i=row-1;i>=0;i--){
                if((j+row-1-i) >= col){
                    break;
                }
                System.out.print(mat[i][j+(row-1-i)]+" ");
            }
            System.out.println();
        }

    }

}
