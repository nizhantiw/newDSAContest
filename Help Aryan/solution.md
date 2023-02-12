import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.print(first(str)+" ");
		System.out.print(second(str)+" ");
	}
	static char first(String str) {
		for(int i=0;i<str.length()-1;i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i) == str.charAt(j)) {
					return str.charAt(i);
				}
			}
		}
		return 0;
	}
	
	static char second(String str) {
		for(int i=str.length()-1;i>=1;i--) {
			for(int j=str.length()-2;j>=0;j--) {
				if(str.charAt(i) == str.charAt(j)) {
					return str.charAt(i);
				}
			}
		}
		return 0;
	}
}