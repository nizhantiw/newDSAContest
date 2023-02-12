import java.io.*;
import java.util.*;
class Main {
public static void main (String[] args) throws Exception{
InputStreamReader br=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(br);
String s1[]=b.readLine().split(" ");
int n=Integer.parseInt(s1[0]);
int k=Integer.parseInt(s1[1]);
int a[]=new int[n];
HashMap<Integer,Integer> map=new HashMap<>();
String s2[]=b.readLine().split(" ");
int ans=0;
for(int i=0;i<n;i++){
a[i]=Integer.parseInt(s2[i]);
if(map.containsKey(a[i])){
if(i-map.get(a[i])==k){
ans=1;
}
else if(i-map.get(a[i])>k){
map.put(a[i],i);
}
}
else{
map.put(a[i],i);
}
}
for(int i=0;i<n;i++){
}
System.out.println(ans);
}
}