import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> a= new ArrayList<>();
        a.add("()");
        a = premuB(a,n);
        for(int i =0;i<a.size();i++)
        System.out.println(a.get(i));

    }
    static ArrayList premuB(ArrayList<String> a,int n){
        if(n==1)
        return a;
        else{
            ArrayList<String>a2 = new ArrayList<>();
            for(int i=0;i<a.size();i++)
            a2.add("(" + a.get(i) + ")");
            for(int i=0;i<a.size();i++)
            a2.add("()" + a.get(i));
            return premuB(a2, n-1);
        }
    }
}