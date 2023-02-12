#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define int long long

signed main(){
    int n;
    cin >> n;
    vector<int>a(n);
    for(auto &i : a) cin>>i;
    sort(a.begin(),a.end());
    cout<<a[n-1] - a[0];
}
