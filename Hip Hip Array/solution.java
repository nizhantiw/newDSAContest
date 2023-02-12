import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        int x =0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n/2;i++){
            x=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=x;
        }
        long sum=0;
        long product=1;
        for(int i=0;i<n;i++){
        
            if((i+1)%2==0){
                sum+=arr[i];
            }else{
                product*=arr[i];
            }
        }
        System.out.print(sum+" "+product);
        

    }
}