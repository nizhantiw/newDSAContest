import java.io.InputStreamReader;

import static java.lang.Math._;
import static java.lang.System._;

import java.lang.reflect.Array;
import java.util._;
import java.io._;
import java.math.*;
public class Main {
public static void main(String[] args) {
FastReader sc = new FastReader(new BufferedInputStream(in));
int times = 1;
while (times-- >0){
solve(sc);
}
}
public static void solve(FastReader sc) {
int n = sc.nextInt();
long[] arr = new long[n];
for (int i = 0; i < n; i++) {
arr[i] = sc.nextLong();
}
sort(arr);
int i = 0;
int j = n-1;
long ans = arr[i]*arr[j];
long sum = arr[i]+arr[j];
i++;
j--;
while (i<j){
if (arr[i]+arr[j] != sum){
System.out.println(-1);
return;
}
ans += (arr[i]\*arr[j]);
i++;
j--;
}
System.out.println(ans);
}
public static void sort(int[] arr){
ArrayList<Integer> ls = new ArrayList<Integer>();
for(int x: arr)
ls.add(x);
Collections.sort(ls);
for(int i=0; i < arr.length; i++)
arr[i] = ls.get(i);
}
public static void sort(long[] arr){
ArrayList<Long> ls = new ArrayList<Long>();
for(long x: arr)
ls.add(x);
Collections.sort(ls);
for(int i=0; i < arr.length; i++)
arr[i] = ls.get(i);
}
public static void print(int[] arr){
for(int x: arr)
System.out.print(x+" ");
System.out.println();
}
static int gcd(int a, int b){
if (b == 0)
return a;
else
return gcd(b, a % b);
}
static long maxSubArraySum(Deque<Long> a){
long size = a.size();
long tempMax = Integer.MIN_VALUE, maxEnd
= 0;
for (int i = 0; i < size; i++) {
maxEnd = maxEnd + a.pollFirst();
if (tempMax < maxEnd)
tempMax = maxEnd;
if (maxEnd < 0)
maxEnd = 0;
}
return tempMax;
}
private static class FastReader {
public BufferedReader br;
public StringTokenizer st;
public FastReader(InputStream is) {
br = new BufferedReader(new InputStreamReader(is));
st = null;
}
String next() {
while (st == null || !st.hasMoreElements()) {
try {
st = new StringTokenizer(br.readLine());
} catch (IOException e) {
e.printStackTrace();
}
}
return st.nextToken();
}
public int nextInt() {
return Integer.parseInt(next());
}
public long nextLong() {
return Long.parseLong(next());
}
public double nextDouble() {
return Double.parseDouble(next());
}
public String nextLine() {
String str = "";
try {
str = br.readLine();
} catch (IOException e) {
e.printStackTrace();
}
return str;
}
}
}
