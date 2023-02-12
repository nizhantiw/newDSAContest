static int isPresent(long arr[], int n, long k)
{
// Your code here
boolean flag = false;
int LE=0;
int RE=n-1;
while(LE<=RE){
int mid =(LE+RE)/2;
if(arr[mid]==k){
flag=true;
break;
}
else if(arr[mid]<k){
LE= mid+1;
}
else if(arr[mid]>k){
RE=mid-1;
}
}
if(flag==true){
return 1;
}else
return -1;
}
