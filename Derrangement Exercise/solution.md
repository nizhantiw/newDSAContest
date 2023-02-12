import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap <Integer, Integer> hm = new HashMap <>();
        boolean flag = false;
        for(int i=0; i<n; i++){
            if(!hm.containsKey(arr[i]))
              hm.put(arr[i],1);
            else{
                int index = hm.get(arr[i]);
                hm.put(arr[i],index+1);
                flag = true;
            }  
        }
            if(flag){
                System.out.print("NO");
            }else{
                System.out.print("YES");
            }
        
    }
}