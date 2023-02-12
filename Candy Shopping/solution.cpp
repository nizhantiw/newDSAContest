#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

#define int long long

signed main()
{
    int n, m;

    cin >> n >> m;
    vector<int> p(n);
    for (auto &i : p)
        cin >> i;
    sort(p.begin(), p.end());
    int cur = 0, ans = 0;
    for (int i = 0; i < n; i++)
    {
        if (cur + p[i] > m)
        {
            break;
        }
        cur += p[i];
        ans++;
    }
    cout << ans;
}