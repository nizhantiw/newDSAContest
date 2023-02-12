static void printPattern(int n,int curr, boolean flag)
{
//Enter your code here
while(true){
System.out.print(curr+" ");
if(!flag && curr == n){
break;
}
if(curr <= 0){
flag = false;
}
curr += flag ? -5 : 5;
}
}
