import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]week = new int[7];
        int sum = 0;
        int temp = 0;
        for(int i = 0;i<7;i++){
            temp = sc.nextInt();
            sum+= temp;
            week[i] = temp;
        }
        sum = n%sum;
        if(sum==0){
            System.out.println("Sunday");
            return;
        }
        int i = 0;
        for(i = 0;i<n;i++){
            sum-= week[i];
            if(sum<=0)break;
        }
        String[]arr = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(arr[i]);

    }
}