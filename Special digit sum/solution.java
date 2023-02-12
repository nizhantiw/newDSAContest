import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int sum =0;
for(int i=0;i<n;i++)
{
int num = sc.nextInt();
int max = 0;
while(num>0)
{
int digit = num%10;
if(digit > max)
{
max = digit;
}
num /= 10;
}
sum += max;
}
System.out.println(sum);
}
}
