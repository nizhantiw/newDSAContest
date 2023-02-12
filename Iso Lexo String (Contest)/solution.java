import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
String str = sc.next();

        HashMap<Character , Character> hm = new HashMap<>();
        int n = str.length();
        char ch = 'a';
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<n ; i++){
            char curr = str.charAt(i);
            if(!hm.containsKey(curr)){
                hm.put(curr , ch);
                ch++;
            }
            sb.append(hm.get(curr));
        }
        System.out.print(sb);
    }

}
