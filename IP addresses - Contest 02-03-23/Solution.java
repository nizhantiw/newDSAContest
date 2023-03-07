import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static void solve(String s, int i, int j, int level, String temp,
     ArrayList<String>res) {
        if(i == (j + 1) && level == 5) {
            res.add(temp.substring(1));
        }
        for(int k = i; k < i + 3 && k <= j; k++) {
            String ad = s.substring(i, k + 1);
            if((s.charAt(i) == '0' && ad.length() > 1) || Integer.valueOf(ad) > 255)
            return;
            solve(s, k + 1, j, level + 1, temp + '.' + ad, res);
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        ArrayList<String> ans = new ArrayList<>();
        solve(s, 0, n - 1, 1, "", ans);
        for(String s1 : ans)
        System.out.println(s1);
        // Your code here
    }
}
