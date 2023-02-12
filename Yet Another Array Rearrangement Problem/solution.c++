#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define int long long
signed main() {
// Your code here
int n;
cin >>n;
vector<int>a(n);
for(auto &i:a) {
cin >> i;
}
int odd=0;
for(auto i:a)
{
if(i%2)odd++;
}
if(odd!=0 and odd !=n){
sort(a.begin(),a.end());
}
for(auto i:a) cout<<i<< ' ';
}
