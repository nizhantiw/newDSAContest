#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define int long long

signed main()
{
    int a, r = 0, c = 0;
    cin >> a;
    int k;
    cin >> k;
    int ans = a * a;
    vector<int> row(a + 1), col(a + 1);
    while (k--)
    {
        int i, j;
        cin >> i >> j;
        if (row[i] == 0)
            ans -= a - c, row[i] = 1, r++;
        if (col[j] == 0)
            ans -= a - r, col[j] = 1, c++;
        cout << ans << ' ';
    }
}