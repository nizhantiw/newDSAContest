import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args)throws IOException {
// Your code here
Scanner sc = new Scanner(System.in);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String rowcol[] = br.readLine().split(" ");
int row = Integer.parseInt(rowcol[0]);
int col = Integer.parseInt(rowcol[1]);
long sum = 0;
long max = 0;
int index = 0;

        String str[] = new String[row];
        for(int i=0;i<row;i++)
        {
            str[i] = br.readLine();
        }
        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++)
        {
            String strArr[] = str[i].split(" ");
            for(int j=0;j<col;j++){
                arr[i][j] = Integer.parseInt(strArr[j]);
                sum += arr[i][j];
            }

            if(sum>max)
            {
                index = i;
                max = sum;
            }
            sum = 0;
        }
        System.out.print(index+1);
    }

}
