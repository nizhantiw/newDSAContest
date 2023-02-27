import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static Set <String> set = new HashSet<>();
    static void permute(String str, int l, int r) {
        if(l == r) {
            set.add(str);
        }
        else {
            for(int i = l; i <= r; i++) {
                str = swap(str,l,i);
                permute(str,l+1,r);
                str = swap(str,l,i);
            }
        }
    }
        static String swap(String a, int i, int j) {
            char temp;
            char[] charArray = a.toCharArray();
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        permute(str,0,n-1);
        List<String>list = new ArrayList<>(set);
        Collections.sort(list);
        for(String val : list)
        System.out.print(val + " ");
    }
}
