import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
TreeMap<Integer,Integer>tm = new TreeMap<>();
int n = sc.nextInt();
int m = 2\*n+2;
int arr[] = new int[m];
for(int i =0;i<m;i++){
arr[i] = sc.nextInt();
tm.put(arr[i],tm.getOrDefault(arr[i],0)+1);
}
for(int num:tm.keySet()){
int k = tm.get(num);
if(k==1){
System.out.print(num+" ");
}
}
}
}
