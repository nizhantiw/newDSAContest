import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner (System.in);
String s = sc.next();
Per_two(s,"");
for(String str:set)
{
System.out.print(str+" ");
}
}
public static TreeSet<String>set = new TreeSet<>();
public static void Per_two(String str, String res){
if(str.length()==0){
set.add(res);
return;
}
for(int j=0;j<str.length();j++){
char a=str.charAt(j);
String resstr=str.substring(0,j)+str.substring(j+1);
Per_two(resstr,res+a);
}
}
}
