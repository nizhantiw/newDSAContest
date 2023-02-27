#include <bits/stdc++.h>
#include <iostream> // header file includes every Standard library
using namespace std;

int main() {
	// Your code here
    int n;
    cin >> n;
    long long a[n];
    for(int i = 0; i < n; i++) {
        cin >> a[i];
    }
    for(int i = 0; i < n; i += 2) {
        cout << a[i] * a[i + 1] << " ";
    }
    return 0;
}
