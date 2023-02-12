import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static int area(int n, int m, int h[], int v[]){

        // Your code here
        Arrays.sort(h);
        Arrays.sort(v);
        int mh=Math.max(h[0],n-h[h.length-1]);
        int mv=Math.max(v[0], m-v[v.length-1]);
        for(int i=0;i<h.length-1;i++){
            mh=Math.max(mh,h[i+1]-h[i]);
        }
        for(int i=0;i<v.length-1;i++){
            mv=Math.max(mv,v[i+1]-v[i]);
        }
        return(int)((long)mh*mv %1000000007);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int H=sc.nextInt();
        int V=sc.nextInt();
        int a[]=new int[H];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int[V];
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        System.out.println(area(N,M,a,b));
    }

}
