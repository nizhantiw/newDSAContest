import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner (System.in);
int m= sc.nextInt();
int n = sc.nextInt();
int mat[][] = new int [m][n];
for(int i=0; i<m; i++){
for(int j=0; j<n; j++){
mat[i][j]=sc.nextInt();
}
}
Spiral(mat);
}
public static void Spiral(int mat[][]){
if(mat == null || mat.length==0){
return;
}
int top = 0;
int bottom = mat.length-1;
int left = 0;
int right = mat[0].length-1;
while (true){
if(left>right){
break;
}
for(int i=left; i<=right; i++){
System.out.print(mat[top][i]+" ");
}
top++;

            if(top>bottom){
                break;
            }
            for(int i=top; i<=bottom; i++){
                System.out.print(mat[i][right]+" ");
            }
            right--;

            if(left>right){
                break;
            }
            for(int i=right; i >= left; i--){
                System.out.print(mat[bottom][i]+" ");
            }
            bottom--;
            if(top>bottom){
                break;
            }
            for(int i=bottom; i>=top; i--){
                System.out.print(mat[i][left]+" ");
            }
            left++;
        }
    }

}
